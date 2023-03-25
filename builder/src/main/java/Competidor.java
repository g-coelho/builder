import java.util.Date;

public class Competidor {
    private String nome;
    private String nomeMae;
    private String nomePai;
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String arteMarcialPrincipal;
    private String arteMarcialSecundaria;
    private float peso;
    private float altura;
    private int totalLutas;
    private int totalVitorias;
    private int totalDerrotas;

    public Competidor(){
        this.nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getArteMarcialPrincipal() {
        return arteMarcialPrincipal;
    }

    public void setArteMarcialPrincipal(String arteMarcialPrincipal) {
        this.arteMarcialPrincipal = arteMarcialPrincipal;
    }

    public String getArteMarcialSecundaria() {
        return arteMarcialSecundaria;
    }

    public void setArteMarcialSecundaria(String arteMarcialSecundaria) {
        this.arteMarcialSecundaria = arteMarcialSecundaria;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getTotalLutas() {
        return totalLutas;
    }

    public void setTotalLutas(int totalLutas) {
        this.totalLutas = totalLutas;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int totalDerrotas) {
        this.totalDerrotas = totalDerrotas;
    }
}

