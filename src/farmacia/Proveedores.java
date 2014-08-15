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
@Table(name = "proveedores", catalog = "proyectofarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p"),
    @NamedQuery(name = "Proveedores.findByIdproveedores", query = "SELECT p FROM Proveedores p WHERE p.idproveedores = :idproveedores"),
    @NamedQuery(name = "Proveedores.findByLaboratoriopertenece", query = "SELECT p FROM Proveedores p WHERE p.laboratoriopertenece = :laboratoriopertenece"),
    @NamedQuery(name = "Proveedores.findByNombreproveedores", query = "SELECT p FROM Proveedores p WHERE p.nombreproveedores = :nombreproveedores"),
    @NamedQuery(name = "Proveedores.findByTelefonoproveedores", query = "SELECT p FROM Proveedores p WHERE p.telefonoproveedores = :telefonoproveedores"),
    @NamedQuery(name = "Proveedores.findByCelularproveedores", query = "SELECT p FROM Proveedores p WHERE p.celularproveedores = :celularproveedores"),
    @NamedQuery(name = "Proveedores.findByDireccionproveedores", query = "SELECT p FROM Proveedores p WHERE p.direccionproveedores = :direccionproveedores")})
public class Proveedores implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_proveedores")
    private Integer idproveedores;
    @Basic(optional = false)
    @Column(name = "Laboratorio_pertenece")
    private String laboratoriopertenece;
    @Basic(optional = false)
    @Column(name = "Nombre_proveedores")
    private String nombreproveedores;
    @Basic(optional = false)
    @Column(name = "Telefono_proveedores")
    private String telefonoproveedores;
    @Column(name = "Celular_proveedores")
    private String celularproveedores;
    @Column(name = "Direccion_proveedores")
    private String direccionproveedores;

    public Proveedores() {
    }

    public Proveedores(Integer idproveedores) {
        this.idproveedores = idproveedores;
    }

    public Proveedores(Integer idproveedores, String laboratoriopertenece, String nombreproveedores, String telefonoproveedores) {
        this.idproveedores = idproveedores;
        this.laboratoriopertenece = laboratoriopertenece;
        this.nombreproveedores = nombreproveedores;
        this.telefonoproveedores = telefonoproveedores;
    }

    public Integer getIdproveedores() {
        return idproveedores;
    }

    public void setIdproveedores(Integer idproveedores) {
        Integer oldIdproveedores = this.idproveedores;
        this.idproveedores = idproveedores;
        changeSupport.firePropertyChange("idproveedores", oldIdproveedores, idproveedores);
    }

    public String getLaboratoriopertenece() {
        return laboratoriopertenece;
    }

    public void setLaboratoriopertenece(String laboratoriopertenece) {
        String oldLaboratoriopertenece = this.laboratoriopertenece;
        this.laboratoriopertenece = laboratoriopertenece;
        changeSupport.firePropertyChange("laboratoriopertenece", oldLaboratoriopertenece, laboratoriopertenece);
    }

    public String getNombreproveedores() {
        return nombreproveedores;
    }

    public void setNombreproveedores(String nombreproveedores) {
        String oldNombreproveedores = this.nombreproveedores;
        this.nombreproveedores = nombreproveedores;
        changeSupport.firePropertyChange("nombreproveedores", oldNombreproveedores, nombreproveedores);
    }

    public String getTelefonoproveedores() {
        return telefonoproveedores;
    }

    public void setTelefonoproveedores(String telefonoproveedores) {
        String oldTelefonoproveedores = this.telefonoproveedores;
        this.telefonoproveedores = telefonoproveedores;
        changeSupport.firePropertyChange("telefonoproveedores", oldTelefonoproveedores, telefonoproveedores);
    }

    public String getCelularproveedores() {
        return celularproveedores;
    }

    public void setCelularproveedores(String celularproveedores) {
        String oldCelularproveedores = this.celularproveedores;
        this.celularproveedores = celularproveedores;
        changeSupport.firePropertyChange("celularproveedores", oldCelularproveedores, celularproveedores);
    }

    public String getDireccionproveedores() {
        return direccionproveedores;
    }

    public void setDireccionproveedores(String direccionproveedores) {
        String oldDireccionproveedores = this.direccionproveedores;
        this.direccionproveedores = direccionproveedores;
        changeSupport.firePropertyChange("direccionproveedores", oldDireccionproveedores, direccionproveedores);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproveedores != null ? idproveedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.idproveedores == null && other.idproveedores != null) || (this.idproveedores != null && !this.idproveedores.equals(other.idproveedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farmacia.Proveedores[ idproveedores=" + idproveedores + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
