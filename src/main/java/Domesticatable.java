interface Domesticatable {
    /**
     * Return the sound made by this creature.
     * 
     * @return    The sound made by this creature.
     **/
    String sound();
}
class dome implements Domesticatable {
    public String sound() {
        return "no sound";
    }
}