public abstract class Observer {
    protected Subject subject;
    private boolean active = true; // Initially, all observers are active

    public abstract void update();

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void detach(Subject subject)
    {
        subject.detach(this);
    }
}
