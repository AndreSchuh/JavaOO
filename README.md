# JavaOO

Este projeto consiste em uma aplicação orientada a objetos em Java, desenvolvida para gerenciar livros, autores, editoras e carrinhos de compras. Ele segue os princípios da programação orientada a objetos, utilizando classes e interfaces para representar diferentes componentes de um sistema de gerenciamento de livros.

# Tecnologias Utilizadas

- Java: Linguagem de programação principal usada para desenvolvimento do projeto.
- Maven: Ferramenta de gerenciamento de dependências e automação do build.

# Estrutura do Projeto

O projeto segue uma organização modular, com as principais classes localizadas em:

```
src/main/java/MoldeLivros
```

### Classes Principais

- Autor.java: Representa os autores dos livros.
- CadastroDeLivros.java: Responsável pelo cadastro e gerenciamento de livros.
- CarrinhoDeCompras.java: Gerencia os itens adicionados ao carrinho de compras.
- Ebook.java: Representa livros no formato digital.
- Editora.java: Representa as editoras responsáveis pelos livros.
- Livro.java: Classe base para representar um livro.
- LivroFisico.java: Representa livros físicos.
- MiniLivro.java: Representa uma versão compacta de um livro.
- Produto.java: Classe genérica para representar itens.
- Promocional.java: Interface para gerenciar promoções aplicáveis a produtos.
- RegistroDeVendas.java: Responsável pelo registro de vendas realizadas.
- RegrasDeDesconto.java: Define as regras de desconto aplicáveis.
- Revista.java: Representa revistas dentro do sistema.

# Como Executar

1. Certifique-se de ter o Java JDK 8 ou superior instalado.
2. Use o Maven para compilar e executar o projeto:
```
   mvn clean install
   mvn exec:java
```

