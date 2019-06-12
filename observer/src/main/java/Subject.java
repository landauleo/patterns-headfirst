import java.util.Observer;

/**
 * User: Anna Nosova
 * Time: 2019-06-12 14:47
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}