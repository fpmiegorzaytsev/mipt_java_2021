/**
 *
 * A container object that contains two values.
 *
 * 1.8
 * Type parameters:
 * @param <T> - type of parameter
 * @param <V> - type of parameter
 */
public final class Pair<T, V> {
    /** field that contains first value of the object */

    private T first;

    /** the field that contains second value of the object*/

    private V second;

    /**Constructs an instance with described values
     * Parameters : two values to describe */
    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    /**Constructs an empty instance*/

    private Pair(){
        this.first = null;
        this.second = null;
    }

    /** Returns a Pair describing the two values
     *
     * @param first first value to describe
     * @param second second value to describe
     * @param <T> the type of first value
     * @param <V> the type of second value
     * @return a Pair with the values present
     */

    public static <T, V> Pair<T, V>of(T first, V second){
        return new Pair<T, V>(first, second);
    }

    /** Returns a Pair with null fields */

    public static <T, V> Pair<T, V>of(){
        return new Pair<T, V>();
    }

    /** Returns first field of the Pair object */

    public T getFirst(){
        return first;
    }

    /** Returns second field of the Pair object */

    public V getSecond(){
        return second;
    }

    /** Sets first field of the Pair object */

    public void setFirst(T first){
        this.first = first;
    }

    /** Sets second field of the Pair object */

    public void setSecond(V second){
        this.second = second;
    }

    /** Indicates if whether some object is "equal" to
     * this Pair. The other object is considered equal if:
     * 1) it is also a Pair and;
     * 2) both instances have null values or;
     * 3) the present values are "equal" to each other via equals();
     * @param obj - an object to be tested for equality
     * @return true if the other object is "equal: to this object otherwise false;
     */

    @Override
    public boolean equals(Object obj){
        if (obj == null || obj.getClass() != getClass()){
            return false;
        }
        else {
            Pair<T, V> pair = (Pair<T, V>)obj;
            boolean flagFirst = true;
            boolean flagSecond = true;
            if(getFirst() == null){
                flagFirst = (pair.getFirst() == null);
            }
            else{
                flagFirst = (getFirst().equals(pair.getSecond()));
            }
            if(getSecond() == null){
                flagSecond = (pair.getSecond() == null);
            }
            else{
                flagSecond = (getSecond().equals(pair.getSecond()));
            }
            return (flagFirst && flagSecond);
        }
    }

    /** Returns the hash code if the object */

    @Override
    public int hashCode(){
        int hashFirst;
        int hashSecond;
        if(getFirst() == null){
            hashFirst = -(Integer.MAX_VALUE);
        }
        else{
            hashFirst = (((getFirst().hashCode()) * 17)>>>16);
        }
        if(getSecond() == null){
            hashSecond = Integer.MAX_VALUE;
        }
        else{
            hashSecond = (((getSecond().hashCode())*19)>>>16);
        }
        return ((hashFirst ^ hashSecond) / (hashFirst ^ hashFirst - 1024));
    }

    /** Returns a string representation of this Pair */

    @Override
    public String toString(){
        if(getFirst() == null && getSecond() != null){
            return("(" + null + ", " + getSecond().toString() + ")");
        }
        if(getFirst() != null && getSecond() == null){
            return ("(" + getFirst().toString() + ", " + null + ")");
        }
        if(getFirst() == null){
            return("(" + null + ", " + null + ")");
        }
        return("(" + getFirst().toString() + ", " + getSecond().toString() + ")");
    }
}