(ns transferencia.clj)

(defn escolher_transferencia []

    (def saldo_em_conta (double 400.00))

    ;(println saldo_em_conta)

    (defn transferir_doc []
        (println "NOME DO BANCO DESTINO")
        (let [name_bank (read-line)]
            (println "Digite 1 para conta corrente")
            (println "Digite 2 para conta poupanca")
            (println "Digite 3 para conta pagamento")

            (let [tipo_conta (read-line)]
                (def n (Integer/parseInt tipo_conta))

                (cond
                    (== n 1) (println "CONTA CORRENTE")
                    (== n 2) (println "CONTA POUPANCA")
                    (== n 3) (println "CONTA PAGAMENTO")
                )
                
                (println "AGENCIA")
                (let [agencia (read-line)]
                    (println "CONTA")
                    (let [conta (read-line)]
                        (println "DV")
                        (let [dv (read-line)]
                            (println "VALOR")
                            (let [valor_transferencia_doc (read-line)]
                                (def value (Double/parseDouble valor_transferencia_doc))

                                (println "Nome do recebedor")
                                (let [name_receptor (read-line)]
                                    (println "CPF do Recebedor")
                                    (let [cpf_receptor (read-line)]
                                        (cond
                                            (<= value saldo_em_conta) ((println "Transferir" value "Para a conta" agencia"-"conta"-"dv)
                                                (println "TRANSFERENCIA BEM SUCEDIDA!")
                                                (println "Saldo anterior da conta:" saldo_em_conta)
                                                (println "Valor Transferido:" value)
                                                (println "Novo saldo em conta:" (- saldo_em_conta value))
                                            )
                                            (> value saldo_em_conta) (println "Tentativa de transferencia mal sucedida, Saldo inferior ao Valor da Transferencia")
                                        ))))))))))

    (defn transferir_ted []
        (println "NOME DO BANCO DESTINO")
        (let [name_bank (read-line)]
            (println "Digite 1 para conta corrente")
            (println "Digite 2 para conta poupanca")
            (println "Digite 3 para conta pagamento")

            (let [tipo_conta (read-line)]
                (def n (Integer/parseInt tipo_conta))

                (cond
                    (== n 1) (println "CONTA CORRENTE")
                    (== n 2) (println "CONTA POUPANCA")
                    (== n 3) (println "CONTA PAGAMENTO")
                )
                
                (println "AGENCIA")
                (let [agencia (read-line)]
                    (println "CONTA")
                    (let [conta (read-line)]
                        (println "DV")
                        (let [dv (read-line)]
                            (println "VALOR")
                            (let [valor_transferencia_ted (read-line)]
                                (def value (Double/parseDouble valor_transferencia_ted))
                                (cond
                                    (<= value saldo_em_conta) (
                                        (println "Transferir" value "Para a conta" agencia"-"conta"-"dv)
                                        (println "TRANSFERENCIA BEM SUCEDIDA!")
                                        (println "Saldo anterior da conta:" saldo_em_conta)
                                        (println "Valor Transferido:" value)
                                        (println "Novo saldo em conta:" (- saldo_em_conta value))
                                    )
                                    (> value saldo_em_conta) (println "Tentativa de transferencia mal sucedida, Saldo inferior ao Valor da Transferencia")
                                ))))))))

    (defn transferir_pix []
        (defn inserir_dados_pix []
            (println "Inserir chave Pix")
            (let [key_pix (read-line)]
                (println "Inserir Valor da Transferencia")
                (let [valor_transferencia_pix (read-line)]
                    (def value_pix (Double/parseDouble valor_transferencia_pix))
                    (cond
                        (<= value_pix saldo_em_conta) (
                            (println "Transferir" value_pix "via Pix")
                            (println "Chave Pix: " key_pix)
                            (println "TRANSFERENCIA BEM SUCEDIDA!")
                            (println "Saldo anterior da conta:" saldo_em_conta)
                            (println "Valor Transferido:" value_pix)
                            (println "Novo saldo em conta:" (- saldo_em_conta value_pix))
                        )
                        (> value_pix saldo_em_conta) (println "Tentativa de transferencia mal sucedida, Saldo inferior ao Valor da Transferencia")
                    ))))

        (println "Digite 1 para Transferir por CPF")
        (println "Digite 2 para Transferir por CNPJ")
        (println "Digite 3 para Transferir por Email")
        (println "Digite 4 para Transferir por Celular")
        (println "Digite 5 para Transferir por Numero Aleatorio")
        (let [tipo_chave (read-line)]
            (def number (Integer/parseInt tipo_chave))

            (cond 
                (== number 1) ((println "Chave escolhida CPF") (inserir_dados_pix))
                (== number 2) ((println "Chave escolhida CNPJ") (inserir_dados_pix))
                (== number 3) ((println "Chave escolhida Email") (inserir_dados_pix))
                (== number 4) ((println "Chave escolhida Celular") (inserir_dados_pix))
                (== number 5) ((println "Chave escolhida Numero Aleatorio") (inserir_dados_pix))
                :else "Chave invalida"
            )))
    

    (println "Digite 1 para realizar transferencia via Pix")
    (println "Digite 2 para realizar transferencia via TED")
    (println "Digite 3 para realizar transferencia via DOC")

    (let [tipo (read-line)]
        (def num (Integer/parseInt tipo))

        (cond
            (== num 1) (transferir_pix ) ;"Tipo escolhido: pix"
            (== num 2) (transferir_ted) ;"Tipo escolhido: TED"
            (== num 3) (transferir_doc) ;"Tipo escolhido: DOC"
            :else "Tipo de transferencia Invalida"
        )))