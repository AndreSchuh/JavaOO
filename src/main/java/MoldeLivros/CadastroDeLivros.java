package MoldeLivros;

public class CadastroDeLivros {

    public static void main (String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini") ;
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8");
        livro.setDescricao("Novos recursos de linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        livro.setAutor(autor);

        livro.mostrarDetalhes();
        autor.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Siveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789-10");

        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Lógica de programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-46-6");

        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();
        autor.mostrarDetalhes();
    }
}