/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Kevin Soto
 */
@Entity
@Table(name = "laboratorios", catalog = "proyectofarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Laboratorios.findAll", query = "SELECT l FROM Laboratorios l"),
    @NamedQuery(name = "Laboratorios.findByIdlaboratorios", query = "SELECT l FROM Laboratorios l WHERE l.idlaboratorios = :idlaboratorios"),
    @NamedQuery(name = "Laboratorios.findByNombrelaboratorios", query = "SELECT l FROM Laboratorios l WHERE l.nombrelaboratorios = :nombrelaboratorios"),
    @NamedQuery(name = "Laboratorios.findByTelefonolaboratorios1", query = "SELECT l FROM Laboratorios l WHERE l.telefonolaboratorios1 = :telefonolaboratorios1"),
    @NamedQuery(name = "Laboratorios.findByTelefonolaboratorios2", query = "SELECT l FROM Laboratorios l WHERE l.telefonolaboratorios2 = :telefonolaboratorios2"),
    @NamedQuery(name = "Laboratorios.findBySucursal", query = "SELECT l FROM Laboratorios l WHERE l.sucursal = :sucursal")})
public class Laboratorios implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_laboratorios")
    private Integer idlaboratorios;
    @Basic(optional = false)
    @Column(name = "Nombre_laboratorios")
    private String nombrelaboratorios;
    @Basic(optional = false)
    @Column(name = "Telefono_laboratorios1")
    private String telefonolaboratorios1;
    @Column(name = "Telefono_laboratorios2")
    private String telefonolaboratorios2;
    @Basic(optional = false)
    @Column(name = "Sucursal")
    private String sucursal;

    public Laboratorios() {
    }

    public Laboratorios(Integer idlaboratorios) {
        this.idlaboratorios = idlaboratorios;
    }

    public Laboratorios(Integer idlaboratorios, String nombrelaboratorios, String telefonolaboratorios1, String sucursal) {
        this.idlaboratorios = idlaboratorios;
        this.nombrelaboratorios = nombrelaboratorios;
        this.telefonolaboratorios1 = telefonolaboratorios1;
        this.sucursal = sucursal;
    }

    public Integer getIdlaboratorios() {
        return idlaboratorios;
    }

    public void setIdlaboratorios(Integer idlaboratorios) {
        Integer oldIdlaboratorios = this.idlaboratorios;
        this.idlaboratorios = idlaboratorios;
        changeSupport.firePropertyChange("idlaboratorios", oldIdlaboratorios, idlaboratorios);
    }

    public String getNombrelaboratorios() {
        return nombrelaboratorios;
    }

    public void setNombrelaboratorios(String nombrelaboratorios) {
        String oldNombrelaboratorios = this.nombrelaboratorios;
        this.nombrelaboratorios = nombrelaboratorios;
        changeSupport.firePropertyChange("nombrelaboratorios", oldNombrelaboratorios, nombrelaboratorios);
    }

    public String getTelefonolaboratorios1() {
        return telefonolaboratorios1;
    }

    public void setTelefonolaboratorios1(String telefonolaboratorios1) {
        String oldTelefonolaboratorios1 = this.telefonolaboratorios1;
        this.telefonolaboratorios1 = telefonolaboratorios1;
        changeSupport.firePropertyChange("telefonolaboratorios1", oldTelefonolaboratorios1, telefonolaboratorios1);
    }

    public String getTelefonolaboratorios2() {
        return telefonolaboratorios2;
    }

    public void setTelefonolaboratorios2(String telefonolaboratorios2) {
        String oldTelefonolaboratorios2 = this.telefonolaboratorios2;
        this.telefonolaboratorios2 = telefonolaboratorios2;
        changeSupport.firePropertyChange("telefonolaboratorios2", oldTelefonolaboratorios2, telefonolaboratorios2);
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        String oldSucursal = this.sucursal;
        this.sucursal = sucursal;
        changeSupport.firePropertyChange("sucursal", oldSucursal, sucursal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlaboratorios != null ? idlaboratorios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laboratorios)) {
            return false;
        }
        Laboratorios other = (Laboratorios) object;
        if ((this.idlaboratorios == null && other.idlaboratorios != null) || (this.idlaboratorios != null && !this.idlaboratorios.equals(other.idlaboratorios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farmacia.Laboratorios[ idlaboratorios=" + idlaboratorios + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
