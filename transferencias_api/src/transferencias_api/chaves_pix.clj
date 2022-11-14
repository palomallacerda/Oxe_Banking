(ns chaves_pix.clj)

(defn gerar-chave-pix []

  (defn criar_chave_cpf []
    (let [chave_cpf (read-line)] ;criando chave com o numero de cpf
      (def cpfs_cadastrados
        {:cpf_criado chave_cpf} ;inserindo cpf criado no mapa de cpfs cadastrados
        )))

  (defn criar_chave_email []
    (let [chave_email (read-line)] ;criando chave com o numero de email
      (def emails_cadastrados
        {:email_criado chave_email} ;inserindo email criado no mapa de emails cadastrados
        )))

  (defn criar_chave_celular []
    (let [chave_celular (read-line)] ;criando chave com o numero de celular
      (def celulares_cadastrados
        {:celular_criado chave_celular} ;inserindo celular criado no mapa de celulares cadastrados
        )))

  (defn criar_chave_aleatoria []
    (def chave_aleatorio (rand-int 99999999)) ;criando número aleatório como chave pix
    (def aleatorios_cadastrados
      {:aleatorio_criado chave_aleatorio} ;inserindo número aleatório criado no mapa de aleatorios cadastrados
      )
        ;(println x)
    )

  (println "digite 1 para gerar chave com numero de CPF")
  (println "digite 2 para gerar chave com endereco de e-mail")
  (println "digite 3 para gerar chave com numero de celular")
  (println "digite 4 para gerar chave com um numero aleatorio")
  (let [chave (read-line)] ;chave
    (def numero (Integer/parseInt chave)) ;converter a chave escolhida para um tipo inteiro
    (if (== 1 numero) ;condicionais para saber o tipo de chave que foi escolhida
            ;(println "Opcao De Chave Escolhida: CPF")
      (let [novo_cpf (criar_chave_cpf)] novo_cpf)
      (if (== 2 numero)
                ;(println "Opcao De Chave Escolhida: E-mail")
        (let [novo_email (criar_chave_email)] novo_email)
        (if (== 3 numero)
                ;(println "Opcao De Chave Escolhida: Numero de Celular")
          (let [novo_celular (criar_chave_celular)] novo_celular)
          (if (== 4 numero)
                        ;(println "Opcao De Chave Escolhida: Numero de Aleatorio")
            (let [novo_aleatorio (criar_chave_aleatoria)] novo_aleatorio)))))))