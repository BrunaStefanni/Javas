package Set_List_Map;
/* Exercício 1 — Que estrutura usar?

1. Os nomes dos alunos pela ordem de inscrição
Estrutura: List
Classe: ArrayList
Justificação: Queremos manter a ordem de inscrição dos alunos. Uma lista permite 
manter a ordem e ter elementos repetidos, se necessário. */

    //Nomes dos alunos pela ordem de inscrição
        List<String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Pedro");
        alunos.add("Maria");

        System.out.println("1. Alunos: " + alunos);


/* 2. Os códigos postais diferentes dos clientes de uma loja
Estrutura: Set
Classe: HashSet
Justificação: Queremos guardar códigos postais sem repetições. Um conjunto 
(Set) não permite elementos duplicados. */

    //Códigos postais diferentes dos clientes
        Set<String> codigosPostais = new HashSet<>();
        codigosPostais.add("2400-100");
        codigosPostais.add("3000-200");
        codigosPostais.add("2400-100"); // Não será repetido

        System.out.println("2. Códigos postais: " + codigosPostais);

/* 3. O preço de cada produto, procurado pelo código
Estrutura: Map
Classe: HashMap
Justificação: Queremos procurar o preço através do código do produto. Um mapa (Map) 
permite associar uma chave (código) a um valor (preço). */

    //Preço de cada produto, procurado pelo código
        Map<String, Double> produtos = new HashMap<>();
        produtos.put("P001", 10.50);
        produtos.put("P002", 25.99);
        produtos.put("P003", 5.75);

        System.out.println("3. Preço do produto P002: " + produtos.get("P002"));

/* 4. O histórico de jogadas de um jogo, incluindo repetidas
Estrutura: List
Classe: ArrayList
Justificação: Precisamos de guardar todas as jogadas pela ordem em que aconteceram, 
incluindo jogadas repetidas.*/

    //Histórico de jogadas, incluindo repetidas
        List<String> jogadas = new ArrayList<>();
        jogadas.add("Avançar");
        jogadas.add("Saltar");
        jogadas.add("Avançar");

        System.out.println("4. Histórico de jogadas: " + jogadas);

/* 5. Os países que uma pessoa já visitou
Estrutura: Set
Classe: HashSet
Justificação: Queremos guardar os países sem repetições, porque visitar o mesmo país 
várias vezes não significa que seja necessário guardá-lo mais do que uma vez. */

    //Países que uma pessoa já visitou
        Set<String> paises = new HashSet<>();
        paises.add("Portugal");
        paises.add("Espanha");
        paises.add("França");
        paises.add("Portugal"); // Não será repetido

        System.out.println("5. Países visitados: " + paises);

/* 6. O número de faltas de cada aluno
Estrutura: Map
Classe: HashMap
Justificação: Queremos associar cada aluno ao seu número de faltas. O nome ou número do 
aluno funciona como chave, e o número de faltas como valor. */

    //Número de faltas de cada aluno
        Map<String, Integer> faltas = new HashMap<>();
        faltas.put("Ana", 2);
        faltas.put("Pedro", 4);
        faltas.put("Maria", 1);

        System.out.println("6. Faltas da Ana: " + faltas.get("Ana"));

/* 7. As palavras de um dicionário, por ordem alfabética e sem repetições
Estrutura: Set
Classe: TreeSet
Justificação: Precisamos de guardar palavras sem repetições e por ordem alfabética. 
O TreeSet organiza os elementos automaticamente. */

    //Palavras por ordem alfabética e sem repetições
        Set<String> palavras = new TreeSet<>();
        palavras.add("Banana");
        palavras.add("Abacate");
        palavras.add("Maçã");
        palavras.add("Banana"); // Não será repetida

        System.out.println("7. Palavras: " + palavras);

/* 8. Senhas de atendimento: o primeiro a chegar é o primeiro a ser atendido
Estrutura: Queue
Classe: ArrayDeque
Justificação: Precisamos de respeitar a ordem de chegada: a primeira senha a entrar é 
a primeira a sair. É o comportamento FIFO (First In, First Out). */

    //Senhas de atendimento: primeiro a chegar,
        // primeiro a ser atendido
        Queue<Integer> senhas = new ArrayDeque<>();
        senhas.offer(101);
        senhas.offer(102);
        senhas.offer(103);

        System.out.println("8. Próxima senha: " + senhas.poll());
        System.out.println("Senhas restantes: " + senhas);

