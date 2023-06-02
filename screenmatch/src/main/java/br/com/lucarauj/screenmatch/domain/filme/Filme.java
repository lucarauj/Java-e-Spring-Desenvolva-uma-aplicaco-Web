package br.com.lucarauj.screenmatch.domain.filme;

public class Filme {

    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;

    public Filme(DadosCadastroFilme dadosCadastroFilme) {
        this.nome = dadosCadastroFilme.nome();
        this.duracaoEmMinutos = dadosCadastroFilme.duracao();
        this.anoLancamento = dadosCadastroFilme.ano();
        this.genero = dadosCadastroFilme.genero();
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }
}
