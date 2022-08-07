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

@Entity(name="dependent01")
public class Dependent_AutoGen implements Serializable {

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
    @Column(nullable=false, precision=10)
    private int type;
    @Column(nullable=false, precision=10)
    private int age;
    @Column(nullable=false, length=1)
    private String gender;

    /** Default constructor. */
    public Dependent_AutoGen() {
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
     * Compares the key for this instance with another Dependent.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Dependent and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Dependent_AutoGen)) {
            return false;
        }
        Dependent_AutoGen that = (Dependent_AutoGen) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Dependent.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Dependent_AutoGen)) return false;
        return this.equalKeys(other) && ((Dependent_AutoGen)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Dependent |");
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
