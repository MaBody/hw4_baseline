package model;

import java.util.HashSet;

public abstract class ExpenseTrackerObserver {

    private HashSet<ExpenseTrackerModelListener> observers;

    /**
     * Registers the given ExpenseTrackerModelListener for
     * state change events.
     *
     * @param listener The ExpenseTrackerModelListener to be registered
     * @return If the listener is non-null and not already registered,
     *         returns true. If not, returns false.
     */
    public boolean register(ExpenseTrackerModelListener listener) {
        // For the Observable class, this is one of the methods.
        if (listener != null || !observers.contains(listener)) {
            return true;
        } else {
            observers.add(listener);
        }
        return false;
    }

    public int numberOfListeners() {
        // For testing, this is one of the methods.
        return observers.size();
    }

    public boolean containsListener(ExpenseTrackerModelListener listener) {
        // For testing, this is one of the methods.
        return observers.contains(listener);
    }

    protected void stateChanged() {
        // For the Observable class, this is one of the methods.
        // for (ExpenseTrackerModelListener o : observers) {
        // o.update();
        // }
    }
}
