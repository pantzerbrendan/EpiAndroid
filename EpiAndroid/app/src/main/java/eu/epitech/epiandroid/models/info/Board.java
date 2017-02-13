
package eu.epitech.epiandroid.models.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "projets",
    "notes",
    "susies",
    "activites",
    "modules",
    "stages",
    "tickets"
})

/**
 * Contains different classes about the student.
 */

public class Board {

    @JsonProperty("projets")
    private List<Projet> projets = new ArrayList<Projet>();
    @JsonProperty("notes")
    private List<Object> notes = new ArrayList<Object>();
    @JsonProperty("susies")
    private List<Susy> susies = new ArrayList<Susy>();
    @JsonProperty("activites")
    private List<Activite> activites = new ArrayList<Activite>();
    @JsonProperty("modules")
    private List<Module> modules = new ArrayList<Module>();
    @JsonProperty("stages")
    private List<Object> stages = new ArrayList<Object>();
    @JsonProperty("tickets")
    private List<Object> tickets = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The projets
     */
    @JsonProperty("projets")
    public List<Projet> getProjets() {
        return projets;
    }

    /**
     * 
     * @param projets
     *     The projets
     */
    @JsonProperty("projets")
    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

    /**
     * 
     * @return
     *     The notes
     */
    @JsonProperty("notes")
    public List<Object> getNotes() {
        return notes;
    }

    /**
     * 
     * @param notes
     *     The notes
     */
    @JsonProperty("notes")
    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    /**
     * 
     * @return
     *     The susies
     */
    @JsonProperty("susies")
    public List<Susy> getSusies() {
        return susies;
    }

    /**
     * 
     * @param susies
     *     The susies
     */
    @JsonProperty("susies")
    public void setSusies(List<Susy> susies) {
        this.susies = susies;
    }

    /**
     * 
     * @return
     *     The activites
     */
    @JsonProperty("activites")
    public List<Activite> getActivites() {
        return activites;
    }

    /**
     * 
     * @param activites
     *     The activites
     */
    @JsonProperty("activites")
    public void setActivites(List<Activite> activites) {
        this.activites = activites;
    }

    /**
     * 
     * @return
     *     The modules
     */
    @JsonProperty("modules")
    public List<Module> getModules() {
        return modules;
    }

    /**
     * 
     * @param modules
     *     The modules
     */
    @JsonProperty("modules")
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    /**
     * 
     * @return
     *     The stages
     */
    @JsonProperty("stages")
    public List<Object> getStages() {
        return stages;
    }

    /**
     * 
     * @param stages
     *     The stages
     */
    @JsonProperty("stages")
    public void setStages(List<Object> stages) {
        this.stages = stages;
    }

    /**
     * 
     * @return
     *     The tickets
     */
    @JsonProperty("tickets")
    public List<Object> getTickets() {
        return tickets;
    }

    /**
     * 
     * @param tickets
     *     The tickets
     */
    @JsonProperty("tickets")
    public void setTickets(List<Object> tickets) {
        this.tickets = tickets;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
