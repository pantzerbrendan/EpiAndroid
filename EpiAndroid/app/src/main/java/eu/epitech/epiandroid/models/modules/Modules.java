/**
 * Created by Maxime on 04/02/2015.
 */
package eu.epitech.epiandroid.models.modules;

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
        "scolaryear",
        "id_user_history",
        "codemodule",
        "codeinstance",
        "title",
        "id_instance",
        "date_ins",
        "cycle",
        "grade",
        "credits",
        "flags",
        "barrage",
        "instance_id",
        "module_rating",
        "semester"
})
/*
* Class used for the modules request, it contains information of the request
 */

public class Modules {

    @JsonProperty("scolaryear")
    private Integer scolaryear;
    @JsonProperty("id_user_history")
    private Object idUserHistory;
    @JsonProperty("codemodule")
    private String codemodule;
    @JsonProperty("codeinstance")
    private String codeinstance;
    @JsonProperty("title")
    private String title;
    @JsonProperty("id_instance")
    private String idInstance;
    @JsonProperty("date_ins")
    private String dateIns;
    @JsonProperty("cycle")
    private String cycle;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("credits")
    private Integer credits;
    @JsonProperty("flags")
    private String flags;
    @JsonProperty("barrage")
    private Integer barrage;
    @JsonProperty("instance_id")
    private String instanceId;
    @JsonProperty("module_rating")
    private String moduleRating;
    @JsonProperty("semester")
    private Integer semester;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The scolaryear
     */
    @JsonProperty("scolaryear")
    public Integer getScolaryear() {
        return scolaryear;
    }

    /**
     * @param scolaryear The scolaryear
     */
    @JsonProperty("scolaryear")
    public void setScolaryear(Integer scolaryear) {
        this.scolaryear = scolaryear;
    }

    /**
     * @return The idUserHistory
     */
    @JsonProperty("id_user_history")
    public Object getIdUserHistory() {
        return idUserHistory;
    }

    /**
     * @param idUserHistory The id_user_history
     */
    @JsonProperty("id_user_history")
    public void setIdUserHistory(Object idUserHistory) {
        this.idUserHistory = idUserHistory;
    }

    /**
     * @return The codemodule
     */
    @JsonProperty("codemodule")
    public String getCodemodule() {
        return codemodule;
    }

    /**
     * @param codemodule The codemodule
     */
    @JsonProperty("codemodule")
    public void setCodemodule(String codemodule) {
        this.codemodule = codemodule;
    }

    /**
     * @return The codeinstance
     */
    @JsonProperty("codeinstance")
    public String getCodeinstance() {
        return codeinstance;
    }

    /**
     * @param codeinstance The codeinstance
     */
    @JsonProperty("codeinstance")
    public void setCodeinstance(String codeinstance) {
        this.codeinstance = codeinstance;
    }

    /**
     * @return The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The idInstance
     */
    @JsonProperty("id_instance")
    public String getIdInstance() {
        return idInstance;
    }

    /**
     * @param idInstance The id_instance
     */
    @JsonProperty("id_instance")
    public void setIdInstance(String idInstance) {
        this.idInstance = idInstance;
    }

    /**
     * @return The dateIns
     */
    @JsonProperty("date_ins")
    public String getDateIns() {
        return dateIns;
    }

    /**
     * @param dateIns The date_ins
     */
    @JsonProperty("date_ins")
    public void setDateIns(String dateIns) {
        this.dateIns = dateIns;
    }

    /**
     * @return The cycle
     */
    @JsonProperty("cycle")
    public String getCycle() {
        return cycle;
    }

    /**
     * @param cycle The cycle
     */
    @JsonProperty("cycle")
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    /**
     * @return The grade
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade The grade
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return The credits
     */
    @JsonProperty("credits")
    public Integer getCredits() {
        return credits;
    }

    /**
     * @param credits The credits
     */
    @JsonProperty("credits")
    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    /**
     * @return The flags
     */
    @JsonProperty("flags")
    public String getFlags() {
        return flags;
    }

    /**
     * @param flags The flags
     */
    @JsonProperty("flags")
    public void setFlags(String flags) {
        this.flags = flags;
    }

    /**
     * @return The barrage
     */
    @JsonProperty("barrage")
    public Integer getBarrage() {
        return barrage;
    }

    /**
     * @param barrage The barrage
     */
    @JsonProperty("barrage")
    public void setBarrage(Integer barrage) {
        this.barrage = barrage;
    }

    /**
     * @return The instanceId
     */
    @JsonProperty("instance_id")
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * @param instanceId The instance_id
     */
    @JsonProperty("instance_id")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * @return The moduleRating
     */
    @JsonProperty("module_rating")
    public String getModuleRating() {
        return moduleRating;
    }

    /**
     * @param moduleRating The module_rating
     */
    @JsonProperty("module_rating")
    public void setModuleRating(String moduleRating) {
        this.moduleRating = moduleRating;
    }

    /**
     * @return The semester
     */
    @JsonProperty("semester")
    public Integer getSemester() {
        return semester;
    }

    /**
     * @param semester The semester
     */
    @JsonProperty("semester")
    public void setSemester(Integer semester) {
        this.semester = semester;
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
