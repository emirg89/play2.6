package models;



import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;

@Entity
public class Usuario extends Model {

    @Id
    @GeneratedValue
    public long id;

    @Constraints.Required
    @Column(length=60, nullable = false)
    public String nombre;

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                "nombre='" + nombre + '\'' +
                '}';
    }


    public static Finder<Long, Usuario> find = new Finder<>(Usuario.class);
}
