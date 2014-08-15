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
@Table(name = "medicamentos", catalog = "proyectofarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Medicamentos.findAll", query = "SELECT m FROM Medicamentos m"),
    @NamedQuery(name = "Medicamentos.findByIdmedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.idmedicamentos = :idmedicamentos"),
    @NamedQuery(name = "Medicamentos.findByProveedormedicamento", query = "SELECT m FROM Medicamentos m WHERE m.proveedormedicamento = :proveedormedicamento"),
    @NamedQuery(name = "Medicamentos.findByNombremedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.nombremedicamentos = :nombremedicamentos"),
    @NamedQuery(name = "Medicamentos.findByDescripcionmedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.descripcionmedicamentos = :descripcionmedicamentos"),
    @NamedQuery(name = "Medicamentos.findByTipomedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.tipomedicamentos = :tipomedicamentos"),
    @NamedQuery(name = "Medicamentos.findByFuncionmedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.funcionmedicamentos = :funcionmedicamentos"),
    @NamedQuery(name = "Medicamentos.findByPreescrito", query = "SELECT m FROM Medicamentos m WHERE m.preescrito = :preescrito"),
    @NamedQuery(name = "Medicamentos.findByFechavence", query = "SELECT m FROM Medicamentos m WHERE m.fechavence = :fechavence"),
    @NamedQuery(name = "Medicamentos.findByFechacompra", query = "SELECT m FROM Medicamentos m WHERE m.fechacompra = :fechacompra"),
    @NamedQuery(name = "Medicamentos.findByNolote", query = "SELECT m FROM Medicamentos m WHERE m.nolote = :nolote"),
    @NamedQuery(name = "Medicamentos.findBySerialmedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.serialmedicamentos = :serialmedicamentos"),
    @NamedQuery(name = "Medicamentos.findByCantidadmedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.cantidadmedicamentos = :cantidadmedicamentos"),
    @NamedQuery(name = "Medicamentos.findByCostomedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.costomedicamentos = :costomedicamentos"),
    @NamedQuery(name = "Medicamentos.findByPreciomedicamentos", query = "SELECT m FROM Medicamentos m WHERE m.preciomedicamentos = :preciomedicamentos")})
public class Medicamentos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_medicamentos")
    private Integer idmedicamentos;
    @Basic(optional = false)
    @Column(name = "Proveedor_medicamento")
    private String proveedormedicamento;
    @Basic(optional = false)
    @Column(name = "Nombre_medicamentos")
    private String nombremedicamentos;
    @Column(name = "Descripcion_medicamentos")
    private String descripcionmedicamentos;
    @Basic(optional = false)
    @Column(name = "Tipo_medicamentos")
    private String tipomedicamentos;
    @Basic(optional = false)
    @Column(name = "Funcion_medicamentos")
    private String funcionmedicamentos;
    @Basic(optional = false)
    @Column(name = "Preescrito")
    private String preescrito;
    @Basic(optional = false)
    @Column(name = "Fecha_vence")
    private String fechavence;
    @Basic(optional = false)
    @Column(name = "Fecha_compra")
    private String fechacompra;
    @Basic(optional = false)
    @Column(name = "No_lote")
    private String nolote;
    @Basic(optional = false)
    @Column(name = "Serial_medicamentos")
    private String serialmedicamentos;
    @Basic(optional = false)
    @Column(name = "Cantidad_medicamentos")
    private int cantidadmedicamentos;
    @Basic(optional = false)
    @Column(name = "Costo_medicamentos")
    private double costomedicamentos;
    @Basic(optional = false)
    @Column(name = "Precio_medicamentos")
    private double preciomedicamentos;

    public Medicamentos() {
    }

    public Medicamentos(Integer idmedicamentos) {
        this.idmedicamentos = idmedicamentos;
    }

     public Medicamentos(Integer idmedicamentos, String proveedormedicamento, String nombremedicamentos, String tipomedicamentos, String funcionmedicamentos, String preescrito, String fechavence, String fechacompra, int cantidadmedicamentos, double preciomedicamentos) {
        this.idmedicamentos = idmedicamentos;
        this.proveedormedicamento = proveedormedicamento;
        this.nombremedicamentos = nombremedicamentos;
        this.tipomedicamentos = tipomedicamentos;
        this.funcionmedicamentos = funcionmedicamentos;
        this.preescrito = preescrito;
        this.fechavence = fechavence;
        this.fechacompra = fechacompra;
        this.cantidadmedicamentos = cantidadmedicamentos;
        this.preciomedicamentos = preciomedicamentos;
    }
     
    public Medicamentos(Integer idmedicamentos, String proveedormedicamento, String nombremedicamentos, String tipomedicamentos, String funcionmedicamentos, String preescrito, String fechavence, String fechacompra, String nolote, String serialmedicamentos, int cantidadmedicamentos, double costomedicamentos, double preciomedicamentos) {
        this.idmedicamentos = idmedicamentos;
        this.proveedormedicamento = proveedormedicamento;
        this.nombremedicamentos = nombremedicamentos;
        this.tipomedicamentos = tipomedicamentos;
        this.funcionmedicamentos = funcionmedicamentos;
        this.preescrito = preescrito;
        this.fechavence = fechavence;
        this.fechacompra = fechacompra;
        this.nolote = nolote;
        this.serialmedicamentos = serialmedicamentos;
        this.cantidadmedicamentos = cantidadmedicamentos;
        this.costomedicamentos = costomedicamentos;
        this.preciomedicamentos = preciomedicamentos;
    }

   
    public Integer getIdmedicamentos() {
        return idmedicamentos;
    }

    public void setIdmedicamentos(Integer idmedicamentos) {
        Integer oldIdmedicamentos = this.idmedicamentos;
        this.idmedicamentos = idmedicamentos;
        changeSupport.firePropertyChange("idmedicamentos", oldIdmedicamentos, idmedicamentos);
    }

    public String getProveedormedicamento() {
        return proveedormedicamento;
    }

    public void setProveedormedicamento(String proveedormedicamento) {
        String oldProveedormedicamento = this.proveedormedicamento;
        this.proveedormedicamento = proveedormedicamento;
        changeSupport.firePropertyChange("proveedormedicamento", oldProveedormedicamento, proveedormedicamento);
    }

    public String getNombremedicamentos() {
        return nombremedicamentos;
    }

    public void setNombremedicamentos(String nombremedicamentos) {
        String oldNombremedicamentos = this.nombremedicamentos;
        this.nombremedicamentos = nombremedicamentos;
        changeSupport.firePropertyChange("nombremedicamentos", oldNombremedicamentos, nombremedicamentos);
    }

    public String getDescripcionmedicamentos() {
        return descripcionmedicamentos;
    }

    public void setDescripcionmedicamentos(String descripcionmedicamentos) {
        String oldDescripcionmedicamentos = this.descripcionmedicamentos;
        this.descripcionmedicamentos = descripcionmedicamentos;
        changeSupport.firePropertyChange("descripcionmedicamentos", oldDescripcionmedicamentos, descripcionmedicamentos);
    }

    public String getTipomedicamentos() {
        return tipomedicamentos;
    }

    public void setTipomedicamentos(String tipomedicamentos) {
        String oldTipomedicamentos = this.tipomedicamentos;
        this.tipomedicamentos = tipomedicamentos;
        changeSupport.firePropertyChange("tipomedicamentos", oldTipomedicamentos, tipomedicamentos);
    }

    public String getFuncionmedicamentos() {
        return funcionmedicamentos;
    }

    public void setFuncionmedicamentos(String funcionmedicamentos) {
        String oldFuncionmedicamentos = this.funcionmedicamentos;
        this.funcionmedicamentos = funcionmedicamentos;
        changeSupport.firePropertyChange("funcionmedicamentos", oldFuncionmedicamentos, funcionmedicamentos);
    }

    public String getPreescrito() {
        return preescrito;
    }

    public void setPreescrito(String preescrito) {
        String oldPreescrito = this.preescrito;
        this.preescrito = preescrito;
        changeSupport.firePropertyChange("preescrito", oldPreescrito, preescrito);
    }

    public String getFechavence() {
        return fechavence;
    }

    public void setFechavence(String fechavence) {
        String oldFechavence = this.fechavence;
        this.fechavence = fechavence;
        changeSupport.firePropertyChange("fechavence", oldFechavence, fechavence);
    }

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        String oldFechacompra = this.fechacompra;
        this.fechacompra = fechacompra;
        changeSupport.firePropertyChange("fechacompra", oldFechacompra, fechacompra);
    }

    public String getNolote() {
        return nolote;
    }

    public void setNolote(String nolote) {
        String oldNolote = this.nolote;
        this.nolote = nolote;
        changeSupport.firePropertyChange("nolote", oldNolote, nolote);
    }

    public String getSerialmedicamentos() {
        return serialmedicamentos;
    }

    public void setSerialmedicamentos(String serialmedicamentos) {
        String oldSerialmedicamentos = this.serialmedicamentos;
        this.serialmedicamentos = serialmedicamentos;
        changeSupport.firePropertyChange("serialmedicamentos", oldSerialmedicamentos, serialmedicamentos);
    }

    public int getCantidadmedicamentos() {
        return cantidadmedicamentos;
    }

    public void setCantidadmedicamentos(int cantidadmedicamentos) {
        int oldCantidadmedicamentos = this.cantidadmedicamentos;
        this.cantidadmedicamentos = cantidadmedicamentos;
        changeSupport.firePropertyChange("cantidadmedicamentos", oldCantidadmedicamentos, cantidadmedicamentos);
    }

    public double getCostomedicamentos() {
        return costomedicamentos;
    }

    public void setCostomedicamentos(double costomedicamentos) {
        double oldCostomedicamentos = this.costomedicamentos;
        this.costomedicamentos = costomedicamentos;
        changeSupport.firePropertyChange("costomedicamentos", oldCostomedicamentos, costomedicamentos);
    }

    public double getPreciomedicamentos() {
        return preciomedicamentos;
    }

    public void setPreciomedicamentos(double preciomedicamentos) {
        double oldPreciomedicamentos = this.preciomedicamentos;
        this.preciomedicamentos = preciomedicamentos;
        changeSupport.firePropertyChange("preciomedicamentos", oldPreciomedicamentos, preciomedicamentos);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedicamentos != null ? idmedicamentos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicamentos)) {
            return false;
        }
        Medicamentos other = (Medicamentos) object;
        if ((this.idmedicamentos == null && other.idmedicamentos != null) || (this.idmedicamentos != null && !this.idmedicamentos.equals(other.idmedicamentos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farmacia.Medicamentos[ idmedicamentos=" + idmedicamentos + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
