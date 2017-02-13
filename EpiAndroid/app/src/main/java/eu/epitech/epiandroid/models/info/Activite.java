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
    "module",
    "module_link",
    "module_code",
    "title_link",
    "timeline_start",
    "timeline_end",
    "timeline_barre",
    "date_inscription",
    "salle",
    "intervenant",
    "token",
    "token_link",
    "register_link"
})


/**
 * Contains activities of the planning.
 */

public class Activite {

    @JsonProperty("title")
    private String title;
    @JsonProperty("module")
    private Object module;
    @JsonProperty("module_link")
    private String moduleLink;
    @JsonProperty("module_code")
    private String moduleCode;
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
    @JsonProperty("salle")
    private String salle;
    @JsonProperty("intervenant")
    private Object intervenant;
    @JsonProperty("token")
    private Object token;
    @JsonProperty("token_link")
    private String tokenLink;
    @JsonProperty("register_link")
    private String registerLink;
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
     *     The module
     */
    @JsonProperty("module")
    public Object getModule() {
        return module;
    }

    /**
     * 
     * @param module
     *     The module
     */
    @JsonProperty("module")
    public void setModule(Object module) {
        this.module = module;
    }

    /**
     * 
     * @return
     *     The moduleLink
     */
    @JsonProperty("module_link")
    public String getModuleLink() {
        return moduleLink;
    }

    /**
     * 
     * @param moduleLink
     *     The module_link
     */
    @JsonProperty("module_link")
    public void setModuleLink(String moduleLink) {
        this.moduleLink = moduleLink;
    }

    /**
     * 
     * @return
     *     The moduleCode
     */
    @JsonProperty("module_code")
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * 
     * @param moduleCode
     *     The module_code
     */
    @JsonProperty("module_code")
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
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
    public Object getIntervenant() {
        return intervenant;
    }

    /**
     * 
     * @param intervenant
     *     The intervenant
     */
    @JsonProperty("intervenant")
    public void setIntervenant(Object intervenant) {
        this.intervenant = intervenant;
    }

    /**
     * 
     * @return
     *     The token
     */
    @JsonProperty("token")
    public Object getToken() {
        return token;
    }

    /**
     * 
     * @param token
     *     The token
     */
    @JsonProperty("token")
    public void setToken(Object token) {
        this.token = token;
    }

    /**
     * 
     * @return
     *     The tokenLink
     */
    @JsonProperty("token_link")
    public String getTokenLink() {
        return tokenLink;
    }

    /**
     * 
     * @param tokenLink
     *     The token_link
     */
    @JsonProperty("token_link")
    public void setTokenLink(String tokenLink) {
        this.tokenLink = tokenLink;
    }

    /**
     * 
     * @return
     *     The registerLink
     */
    @JsonProperty("register_link")
    public String getRegisterLink() {
        return registerLink;
    }

    /**
     * 
     * @param registerLink
     *     The register_link
     */
    @JsonProperty("register_link")
    public void setRegisterLink(String registerLink) {
        this.registerLink = registerLink;
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
