public class Glass {
    private float maxGallons;
    private float currentGallons;

    public Glass(float maxGallons){
        this.maxGallons = maxGallons;

    }


    public void addWater(float gallonsToAdd) throws GlassOverflownException{
        float newTotal = gallonsToAdd + currentGallons;

        if(newTotal>this.maxGallons){
            throw new GlassOverflownException("Too much water! Please reduce.");
        }
        else{
            this.currentGallons = newTotal;
            System.out.println(newTotal + " is the new total.");
        }
    }


}

