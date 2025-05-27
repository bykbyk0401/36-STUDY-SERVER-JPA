package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member extends BaseEntity {

//    // 직접 할당
//    @Id
//    private String id;

    // SEQUENCE 전략
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false) //db 컬럼명
    private String username;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Team team;

    public Member() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    //    필드와 컬럼 매핑

//    private Integer age;

//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//
//    private LocalDate testLocalDate; // 년,월
//    private LocalDateTime testLocalDateTime; // 년,월,일
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;

//    @Lob
//    private String description;

}
