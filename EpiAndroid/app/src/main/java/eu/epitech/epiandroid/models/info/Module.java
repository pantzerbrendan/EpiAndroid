
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
    "title_link",
    "timeline_start",
    "timeline_end",
    "timeline_barre",
    "date_inscription"
})

/**
 * Contains informations about the module.
 */

public class Module {

    @JsonProperty("title")
    private String title;
    @JsonProperty("title_link")
    private String titleLink;
    @JsonProperty("timeline_start")
    private String timelineStart;
    @JsonProperty("timeline_end")
    private String timelineEnd;
    @JsonProperty("timeline_barre")
    private String timelineBarre;
    @JsonProperty("date_inscription")
    private String dateInscription;
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
     *     The titleLink
     */
    @JsonProperty("title_link")
    public String getTitleLink() {
        return titleLink;
    }

    /**
     * 
     * @param titleLink
     *     The title_link
     */
    @JsonProperty("title_link")
    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
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
     *     The dateInscription
     */
    @JsonProperty("date_inscription")
    public String getDateInscription() {
        return dateInscription;
    }

    /**
     * 
     * @param dateInscription
     *     The date_inscription
     */
    @JsonProperty("date_inscription")
    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
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
