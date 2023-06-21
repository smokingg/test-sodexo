package app.registeruser.apirest.model;
import jakarta.persistence.*;


@Entity
@Table(name = "favorites")
public class Favoritos {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;
private String summary;
private String fech;
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
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
public String getFech() {
	return fech;
}
public void setFech(String fech) {
	this.fech = fech;
}

}
