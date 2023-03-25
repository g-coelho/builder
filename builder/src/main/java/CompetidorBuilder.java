import java.util.Date;

public class CompetidorBuilder {
    private Competidor competidor;

    public CompetidorBuilder(){
        competidor = new Competidor();
    }

    public Competidor build(){
        if(competidor.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido.");
        }

        return competidor;
    }

    public CompetidorBuilder setNome(String nome) {
        competidor.setNome(nome);
        return this;
    }

    public CompetidorBuilder setNomeMae(String nomeMae) {
        competidor.setNomeMae(nomeMae);
        return this;
    }

    public CompetidorBuilder setNomePai(String nomePai) {
        competidor.setNomePai(nomePai);
        return this;
    }

    public CompetidorBuilder setDataNascimento(Date dataNascimento) {
        competidor.setDataNascimento(dataNascimento);
        return this;
    }

    public CompetidorBuilder setCpf(String cpf) {
        competidor.setCpf(cpf);
        return this;
    }

    public CompetidorBuilder setRg(String rg) {
        competidor.setRg(rg);
        return this;
    }

    public CompetidorBuilder setArteMarcialPrincipal(String arteMarcialPrincipal) {
        competidor.setArteMarcialPrincipal(arteMarcialPrincipal);
        return this;
    }

    public CompetidorBuilder setArteMarcialSecundaria(String arteMarcialSecundaria) {
        competidor.setArteMarcialSecundaria(arteMarcialSecundaria);
        return this;
    }

    public CompetidorBuilder setPeso(float peso) {
        competidor.setPeso(peso);
        return this;
    }

    public CompetidorBuilder setAltura(float altura) {
        competidor.setAltura(altura);
        return this;
    }

    public CompetidorBuilder setTotalLutas(int totalLutas) {
        competidor.setTotalLutas(totalLutas);
        return this;
    }

    public CompetidorBuilder setTotalVitorias(int totalVitorias) {
        competidor.setTotalVitorias(totalVitorias);
        return this;
    }

    public CompetidorBuilder setTotalDerrotas(int totalDerrotas) {
        competidor.setTotalDerrotas(totalDerrotas);
        return this;
    }
    
    
    
}
