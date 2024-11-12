package com.volhub.v1.Modals;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserModal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phno;
    private String password;
    private String role;
    private String avatar;

    @ElementCollection
    private List<String>onetoonechat;
    
    @ElementCollection
    private List<String> groupchat;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private ProfileModal profile;

    public ProfileModal getProfile() {
        return profile;
    }

    

    public List<String> getOnetoonechat() {
        return onetoonechat;
    }



    public void setOnetoonechat(List<String> onetoonechat) {
        this.onetoonechat = onetoonechat;
    }



    public List<String> getGroupchat() {
        return groupchat;
    }



    public void setGroupchat(List<String> groupchat) {
        this.groupchat = groupchat;
    }



    public void setProfile(ProfileModal profile) {
        this.profile = profile;
    }

    public UserModal() {
    }

   
    public UserModal(Long id, String name, String email, String phno, String password, String role, String avatar,
            List<String> onetoonechat, List<String> groupchat, ProfileModal profile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phno = phno;
        this.password = password;
        this.role = role;
        this.avatar = avatar;
        this.onetoonechat = onetoonechat;
        this.groupchat = groupchat;
        this.profile = profile;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}