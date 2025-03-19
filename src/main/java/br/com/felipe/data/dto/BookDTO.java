package br.com.felipe.data.dto;

import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class BookDTO extends RepresentationModel<BookDTO> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String author;
    private Date launchDate;
    private Double price;

    public BookDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDTO bookDTO)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getId(), bookDTO.getId()) && Objects.equals(getTitle(), bookDTO.getTitle()) && Objects.equals(getAuthor(), bookDTO.getAuthor()) && Objects.equals(getLaunchDate(), bookDTO.getLaunchDate()) && Objects.equals(getPrice(), bookDTO.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getTitle(), getAuthor(), getLaunchDate(), getPrice());
    }
}
