public class PermanentEmployee extends Employee {
    private float pfpercentage;
    private float pfamount;

    public void setPfpercentage(float pfpercentage) {
        this.pfpercentage = pfpercentage;
    }

    public void setPfamount(float pfamount) {
        this.pfamount = pfamount;
    }

    public float getPfpercentage() {
        return pfpercentage;
    }

    public float getPfamount() {
        return pfamount;
    }

    public void findNetSalary() {
        float x = 0;
        pfamount = (super.getSalary() * pfpercentage) / 100;
        x = super.getSalary() - pfamount;
        setNetsalary(x);
    }

    public boolean validateInput() {
        if ((super.getSalary() > 0) && (pfpercentage >= 0))
            return true;
        else
            return false;
    }
}