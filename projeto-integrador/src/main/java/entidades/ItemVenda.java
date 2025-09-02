package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;

    public Double valorParcial;

    public Integer quantidadeParcial;

    @ManyToOne
    public Produto produto;
}