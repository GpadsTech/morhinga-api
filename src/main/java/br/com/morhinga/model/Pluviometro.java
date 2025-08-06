package br.com.morhinga.model;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "Pluviometro")
public class Pluviometro {

    //@Id
    //private ObjectId id;

    @Field("Data")
    private String data;

    @Field("Hora")
    private String hora;

    @Field("Medida de chuva (calculado)")
    private Double medidaDeChuvaCalculado;

    @Field("Medida de chuva (contagem)")
    private Integer medidaDeChuvaContagem;

    public Pluviometro() {}

    // Getters e Setters
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Double getMedidaDeChuvaCalculado() { return medidaDeChuvaCalculado; }
    public void setMedidaDeChuvaCalculado(Double medidaDeChuvaCalculado) { this.medidaDeChuvaCalculado = medidaDeChuvaCalculado; }

    public Integer getMedidaDeChuvaContagem() { return medidaDeChuvaContagem; }
    public void setMedidaDeChuvaContagem(Integer medidaDeChuvaContagem) { this.medidaDeChuvaContagem = medidaDeChuvaContagem; }
}
