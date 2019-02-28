<script language="javascript">
		var sizeAceite;

		var urlAceite = document.getElementById('urlAceite');
		var urlToken = document.getElementById('urlToken');
		
		console.log("URL-ACEITE: " + urlAceite.value);
		console.log("URL-TOKEN: " + urlToken.value);
		
		var accessToken;
		var json = {
			chaveAcesso:"26a6d30474164404bb6e856f8e3d1c28",
			codigoGrupo: 999
		};
		json = JSON.stringify(json);
				
	    $.ajax({
	    	type: "POST",
	        url: "http://bvpvida.dsv.bradseg.com.br/be/oauth/api/v1/account/system-oauth",
	       	async: false,		
	        dataType: 'json',
	        contentType: 'application/json',
			data: json,
			success: function(response) {
				var accessToken = response.data.access_token;
				getContador(accessToken);
			},
			error: function(e) {
				console.log('Error:' + e);
			}
		});

		function getContador(token){
			$.ajax({
				beforeSend: function(request) {
					request.setRequestHeader("Authorization", "Bearer " + token);
				},
				url: "http://bvpvida.dsv.bradseg.com.br/be/aceite-digital/api/v1/aceite-digital/correntista/02893438792/B71B5767-3DF1-46EE-B1BA-B91BA3008623",
				async: false,
				contentType: 'application/json',
				dataType: 'json',
				success: function(json) {
					sizeAceite = json.data;
				},
				error: function(e){  
					   console.log('Error: ' + e);  
				} 
			});
		}

		if(sizeAceite.length >= 0){
			const valor = document.getElementById('idaceite');
			valor.innerHTML = valor.innerText + '  (' + sizeAceite.length + ')';
		}
		</script>