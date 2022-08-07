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
import javax.persistence.Version;

@Entity(name="branch01")
public class Branch_AutoGen implements Serializable {

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
    @Column(nullable=false, length=500)
    private String address;
    @Column(name="contact_no", nullable=false, length=12)
    private String contactNo;
    @Column(name="manager_id", nullable=false, length=10)
    private String managerId;
    @Column(name="no_of_employees", nullable=false, precision=10)
    private int noOfEmployees;
    @Column(nullable=false, precision=10)
    private int type;

    /** Default constructor. */
    public Branch_AutoGen() {
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
     * Access method for managerId.
     *
     * @return the current value of managerId
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Setter method for managerId.
     *
     * @param aManagerId the new value for managerId
     */
    public void setManagerId(String aManagerId) {
        managerId = aManagerId;
    }

    /**
     * Access method for noOfEmployees.
     *
     * @return the current value of noOfEmployees
     */
    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    /**
     * Setter method for noOfEmployees.
     *
     * @param aNoOfEmployees the new value for noOfEmployees
     */
    public void setNoOfEmployees(int aNoOfEmployees) {
        noOfEmployees = aNoOfEmployees;
    }

    /**
     * Access method for type.
     *
     * @return the current value of type
     */
    public int getType() {
        return type;
    }

    /**
     * Setter method for type.
     *
     * @param aType the new value for type
     */
    public void setType(int aType) {
        type = aType;
    }

    /**
     * Compares the key for this instance with another Branch.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Branch and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Branch_AutoGen)) {
            return false;
        }
        Branch_AutoGen that = (Branch_AutoGen) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Branch.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Branch_AutoGen)) return false;
        return this.equalKeys(other) && ((Branch_AutoGen)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Branch |");
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
