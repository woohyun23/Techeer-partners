package Techeer_partners.Techeer_partners.domain;

public class Member {

    private Long id; //고객이 정하는 id가 아닌 시스템이 정하는 id
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
