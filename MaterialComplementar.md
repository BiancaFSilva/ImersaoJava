# Aula 01: Consumindo uma API de filmes com Java
## Links citados
- Os [250 melhores filmes de acordo com a classificação do IMDB](https://www.imdb.com/chart/top/).
- A [documentação da API do IMDB](https://imdb-api.com/api).
- Instalação do Visual Studio Code com o [Coding Pack para Java](https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java).
- Documentação da classe [HttpRequest do pacote java.net.http](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html).
- Classe pronta que utiliza Expressões Regulares para fazer [parse de um JSON](https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3).
- [Biblioteca Jackson](https://github.com/FasterXML/jackson), que faz parse de JSON.
- Site que ajuda a entender [Expressões Regulares](https://regex101.com/).
- Artigo: [Como deixar no seu GitHub com um README interessante](https://www.alura.com.br/artigos/escrever-bom-readme).
- O endpoint da API do IMDB que devolve os 250 melhores filmes: https://imdb-api.com/en/API/Top250Movies/ + SUA-API-KEY
## Desafios
- Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.
- Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!
- Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente
- Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON
- Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.
## Material complementar
- Artigo [“O que é JSON?”](https://www.alura.com.br/artigos/o-que-e-json).
- Artigo sobre como [pintar o terminal, com tabelinha de cores e negrito](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis).
- rtigo sobre como usar [VS Code para codar em Java](https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code).

# Aula 02: Gerando figurinhas para WhatsApp
## Links citados
- Documentação do [pacote javax.imageio](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html), que trata de leitura e escrita de imagens.
- Documentação da [classe BufferedImage](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html), que representa uma imagem no Java
- Documentação da [classe Graphics2D](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html), a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.
- Documentação da [abstração InputStream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html), que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.
## Desafios
- Ler a documentação da classe abstrata InputStream.
- Centralizar o texto na figurinha.
- Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!
- Criar diretório de saída das imagens, se ainda não existir.
- Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
- Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!
- Colocar contorno (outline) no texto da imagem.
- Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
- Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
- Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la.
## Material complementar
- Primeira aula do curso [“Java Polimorfismo: entenda herança e interfaces”](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo) da Alura.
- Apêndice da apostila [“Java e Orientação a Objetos”](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io) sobre o pacote java.io que explica com mais detalhes a abstração InputStream.

# Aula 03: Ligando as pontas, refatoração e orientação a objetos
## Links citados
- Documentação das [APIs da NASA](https://api.nasa.gov/).
- API da [Foto Astronômica do Dia](https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY), da NASA.
- Artigo [“Como não aprender Java e Orientação a Objetos: getters e setters”](https://www.alura.com.br/artigos/nao-aprender-oo-getters-e-setters).
- Livro [“Design Patterns”](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612), de 1994, que descreve soluções comuns para problemas recorrentes de como organizar seu código.
- Livro [“Refactoring”](https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672), de 1999, que cataloga maneiras sistemáticas de melhorar o código sem modificar o que é feito.
## Desafios
- Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16
- Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP
- Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra
- Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado
- Desafio supremo: consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas: clique aqui.
## Material complementar
- Artigo [“Como não aprender Java e Orientação a Objetos: herança”](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca).
- Podcast Hipsters.tech sobre [Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453).
- Podcast Hipsters.tech sobre [Design Patterns](https://www.alura.com.br/podcast/design-patterns-hipsters-206-a345).
- Podcast Hipsters.tech sobre [SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649).

# Aula 04: Criando nossa própria API com Spring
## Links citados
- [Documentação do Spring Framework](https://spring.io/).
- Link para [iniciar um projeto utilizando Spring](https://start.spring.io/).
- Link para [download do Maven](https://maven.apache.org/download.cgi).
- Link para [download do Postman](https://www.postman.com/).
- Página para fazer o [registro e começar a utilizar o MongoDb Atlas](https://www.mongodb.com/cloud/atlas/register).
- GitHub com os [logos das linguagens de programação](https://github.com/abrahamcalf/programming-languages-logos).
- Artigo sobre o [pack de stickers da Alura para Whatsapp e Telegram](https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram).
## Desafios
- Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
- Devolver a listagem ordenada pelo ranking;
- Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
- Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
- Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.
## Material complementar
- Primeira aula do curso [“Maven: gerenciamento de dependências e build de aplicações Java”](https://www.alura.com.br/conteudo/maven-gerenciamento-dependencias-build-aplicacoes-java) da Alura.
- Alura+ [“O que é REST?”](https://www.youtube.com/watch?v=weQ8ssA6iBU&ab_channel=AluraCursosOnline).
- Artigo [“Conceito e fundamentos sobre REST”](https://www.alura.com.br/artigos/rest-conceito-e-fundamentos).
- Podcast [Hipsters.Tech sobre MongoDB](https://www.hipsters.tech/mongodb-hipsters-ponto-tech-305/).
- Hipters.Tube [“O que é SQL e NoSQL?](https://www.youtube.com/watch?v=aure5d3B88g&ab_channel=AluraCursosOnline).
- Artigo [“Spring: Conheça esse framework Java”](https://www.alura.com.br/artigos/spring-conheca-esse-framework-java).
- Alura+ [Introdução ao Postman](https://www.youtube.com/watch?v=op81bMbgZXs&ab_channel=AluraCursosOnline).

# Aula 5: Publicando nossa API no Cloud
## Links citados
- [Dev em T: especialista x generalista](https://www.alura.com.br/dev-em-t).
- Site do [Heroku](https://www.heroku.com/), que é um PaaS (plataforma como serviço).
- Documentação sobre a [Oracle Cloud](https://docs.oracle.com/pt-br/iaas/Content/home.htm).
- Artigo: [Como elaborar um bom arquivo Readme para os seus projetos](https://www.alura.com.br/artigos/escrever-bom-readme).
## Desafios
- Compartilhe com seus amigos a sua URL do Heroku, para que eles possam consumir a sua API (com o padrão de atributos title e image) e gerar figurinhas do conteúdo que você utilizou (linguagens de programação, filmes, músicas);
- Colocar a aplicação no cloud da Oracle;
- Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas para que se possa fazer um ranking;
- Desafio supremo: Evoluir o projeto das três primeiras aula para que ele gere um bundle de stickers, para que se possa fazer o download e já incluir vários stickers no WhatsApp; Usar os conhecimentos aprendidos em alguma imersão React da Alura e fazer uma aplicação front-end para gerar esse bundle, onde possa se passar a URL do conteúdo e já visualizar os stickers;
## Material complementar
- Artigo: [“Heroku, Vercel e outras opções de Cloud como plataforma”](https://www.alura.com.br/artigos/heroku-vercel-outras-opcoes-cloud-plataforma).
- Podcast Hipters.Tech [“Integração Contínua, Deploy Contínuo e Github Actions”](https://www.alura.com.br/podcast/hipsterstech-integracao-continua-deploy-continuo-e-github-actions-hipsters-213-a335).
- Pesquisa da JetBrains, empresa que desenvolve a IDE IntelliJ, sobre o [ecossistema Java em 2021](https://www.jetbrains.com/lp/devecosystem-2021/java/).
