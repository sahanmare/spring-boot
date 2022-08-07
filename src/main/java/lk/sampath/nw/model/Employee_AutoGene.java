// Generated with g9.

package lk.sampath.nw.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="employee", indexes={@Index(name="employee_nic_IX", columnList="nic", unique=true)})
public class Employee_AutoGene implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=100)
    private String name;
    @Column(unique=true, nullable=false, length=16)
    private String nic;
    @Column(nullable=false, length=1)
    private String gender;
    @Column(nullable=false, length=500)
    private String address;
    @Column(name="contact_no", nullable=false, length=12)
    private String contactNo;
    @Column(nullable=false, precision=10)
    private int age;
    @Column(nullable=false, precision=22)
    private double salary;

    /** Default constructor. */
    public Employee_AutoGene() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for nic.
     *
     * @return the current value of nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * Setter method for nic.
     *
     * @param aNic the new value for nic
     */
    public void setNic(String aNic) {
        nic = aNic;
    }

    /**
     * Access method for gender.
     *
     * @return the current value of gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter method for gender.
     *
     * @param aGender the new value for gender
     */
    public void setGender(String aGender) {
        gender = aGender;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(String aAddress) {
        address = aAddress;
    }

    /**
     * Access method for contactNo.
     *
     * @return the current value of contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * Setter method for contactNo.
     *
     * @param aContactNo the new value for contactNo
     */
    public void setContactNo(String aContactNo) {
        contactNo = aContactNo;
    }

    /**
     * Access method for age.
     *
     * @return the current value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter method for age.
     *
     * @param aAge the new value for age
     */
    public void setAge(int aAge) {
        age = aAge;
    }

    /**
     * Access method for salary.
     *
     * @return the current value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter method for salary.
     *
     * @param aSalary the new value for salary
     */
    public void setSalary(double aSalary) {
        salary = aSalary;
    }

    /**
     * Compares the key for this instance with another Employee.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Employee and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Employee_AutoGene)) {
            return false;
        }
        Employee_AutoGene that = (Employee_AutoGene) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Employee.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Employee_AutoGene)) return false;
        return this.equalKeys(other) && ((Employee_AutoGene)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Employee |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
