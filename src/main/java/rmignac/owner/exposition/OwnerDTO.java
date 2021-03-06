package rmignac.owner.exposition;

import rmignac.bonsai.exposition.BonsaiDTO;

import java.util.List;
import java.util.UUID;

public class OwnerDTO {

    private UUID id;
    private String name;
    private List<BonsaiSimplifieDTO> bonsais;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BonsaiSimplifieDTO> getBonsais() {
        return bonsais;
    }

    public void setBonsais(List<BonsaiSimplifieDTO> bonsais) {
        this.bonsais = bonsais;
    }
}
