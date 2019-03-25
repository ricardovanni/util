select * from tb_AceiteDigital_Transferencia t
join tb_AceiteDigital_Transferencia_Origem tor on (t.idTransferencia = tor.idTransferencia)