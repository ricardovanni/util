<!-- <script>
	function getVoltar(){
		window.history.back();
	}
</script> -->



<form action="menu.do" name="getVoltar" id="getVoltar">
	<input name="op" value="2" type="hidden" /> <input name="contribuir"
		value="true" type="hidden" />
</form>

<script>
	function getVoltar() {
		document.forms['getVoltar'].submit();
	}
</script>