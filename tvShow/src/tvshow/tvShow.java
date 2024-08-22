/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * This is the Object class, it has a constructor that receives the data from 
 * excel to create the tvShow objects.
 * 
 */
package tvshow;


public class tvShow {
    
    private String name;
    private String yearPremier;
    private String seasons;
    private String episodes;
    private String network;
    private String genre;
    private String maleLead;
    private String femaleLead;
    
    //object constructor
    tvShow(String name, String yearPremier, String seasons, String episodes, String network,
           String genre, String maleLead, String femaleLead)
    {
        this.name = name;
        this.yearPremier = yearPremier;
        this.seasons = seasons;
        this.episodes = episodes;
        this.network = network;
        this.genre = genre;
        this.maleLead = maleLead;
        this.femaleLead = femaleLead;
    }
    
    //getter methods
    public String getName()
    {
        return name;
    }
    
    public String getYearPremier()
    {
        return yearPremier;
    }
    
    public String getSeasons()
    {
        return seasons;
    }
    
    public String getEpisodes()
    {
        return episodes;
    }
    
    public String getNetwork()
    {
        return network;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public String getMaleLead()
    {
        return maleLead;
    }
    
    public String getFemaleLead()
    {
        return femaleLead;
    }

    
    
    
}
