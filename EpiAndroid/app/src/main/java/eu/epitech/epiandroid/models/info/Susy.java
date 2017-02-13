
package eu.epitech.epiandroid.models.info;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "title",
    "creneau_link",
    "timeline_start",
    "timeline_barre",
    "timeline_end",
    "salle",
    "intervenant",
    "etat",
    "type"
})

/**
 * Contains informations about the current susy class.
 */

public class Susy {

    @JsonProperty("title")
    private String title;
    @JsonProperty("creneau_link")
    private String creneauLink;
    @JsonProperty("timeline_start")
    private String timelineStart;
    @JsonProperty("timeline_barre")
    private String timelineBarre;
    @JsonProperty("timeline_end")
    private String timelineEnd;
    @JsonProperty("salle")
    private String salle;
    @JsonProperty("intervenant")
    private String intervenant;
    @JsonProperty("etat")
    private String etat;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The creneauLink
     */
    @JsonProperty("creneau_link")
    public String getCreneauLink() {
        return creneauLink;
    }

    /**
     * 
     * @param creneauLink
     *     The creneau_link
     */
    @JsonProperty("creneau_link")
    public void setCreneauLink(String creneauLink) {
        this.creneauLink = creneauLink;
    }

    /**
     * 
     * @return
     *     The timelineStart
     */
    @JsonProperty("timeline_start")
    public String getTimelineStart() {
        return timelineStart;
    }

    /**
     * 
     * @param timelineStart
     *     The timeline_start
     */
    @JsonProperty("timeline_start")
    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    /**
     * 
     * @return
     *     The timelineBarre
     */
    @JsonProperty("timeline_barre")
    public String getTimelineBarre() {
        return timelineBarre;
    }

    /**
     * 
     * @param timelineBarre
     *     The timeline_barre
     */
    @JsonProperty("timeline_barre")
    public void setTimelineBarre(String timelineBarre) {
        this.timelineBarre = timelineBarre;
    }

    /**
     * 
     * @return
     *     The timelineEnd
     */
    @JsonProperty("timeline_end")
    public String getTimelineEnd() {
        return timelineEnd;
    }

    /**
     * 
     * @param timelineEnd
     *     The timeline_end
     */
    @JsonProperty("timeline_end")
    public void setTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    /**
     * 
     * @return
     *     The salle
     */
    @JsonProperty("salle")
    public String getSalle() {
        return salle;
    }

    /**
     * 
     * @param salle
     *     The salle
     */
    @JsonProperty("salle")
    public void setSalle(String salle) {
        this.salle = salle;
    }

    /**
     * 
     * @return
     *     The intervenant
     */
    @JsonProperty("intervenant")
    public String getIntervenant() {
        return intervenant;
    }

    /**
     * 
     * @param intervenant
     *     The intervenant
     */
    @JsonProperty("intervenant")
    public void setIntervenant(String intervenant) {
        this.intervenant = intervenant;
    }

    /**
     * 
     * @return
     *     The etat
     */
    @JsonProperty("etat")
    public String getEtat() {
        return etat;
    }

    /**
     * 
     * @param etat
     *     The etat
     */
    @JsonProperty("etat")
    public void setEtat(String etat) {
        this.etat = etat;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
