package creational.abstractFactory;
// Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance implements Instance
{

    public GoogleComputeEngineInstance(Capacity capacity)
    {
        //Map capacity to GCP compute instance types. Use GCO API to provision
        System.out.println("Created Google Compute Engine Instance");
    }
    @Override
    public void start()
    {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage)
    {
        System.out.println("Attached "+storage+ " to Compute engine instance");
    }

    @Override
    public void stop()
    {
        System.out.println("Compute engine instance stopped");
    }

    @Override
    public String toString()
    {
        return "Google Compute Engine Instance";
    }
}
