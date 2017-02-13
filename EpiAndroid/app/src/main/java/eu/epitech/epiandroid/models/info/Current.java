
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
    "active_log",
    "credits_min",
    "credits_norm",
    "credits_obj",
    "nslog_min",
    "nslog_norm",
    "semester_code",
    "semester_num",
    "achieved",
    "failed",
    "inprogress"
})
public class Current {

    @JsonProperty("active_log")
    private String activeLog;
    @JsonProperty("credits_min")
    private String creditsMin;
    @JsonProperty("credits_norm")
    private String creditsNorm;
    @JsonProperty("credits_obj")
    private String creditsObj;
    @JsonProperty("nslog_min")
    private String nslogMin;
    @JsonProperty("nslog_norm")
    private String nslogNorm;
    @JsonProperty("semester_code")
    private String semesterCode;
    @JsonProperty("semester_num")
    private String semesterNum;
    @JsonProperty("achieved")
    private Integer achieved;
    @JsonProperty("failed")
    private Integer failed;
    @JsonProperty("inprogress")
    private Integer inprogress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The activeLog
     */
    @JsonProperty("active_log")
    public String getActiveLog() {
        return activeLog;
    }

    /**
     * 
     * @param activeLog
     *     The active_log
     */
    @JsonProperty("active_log")
    public void setActiveLog(String activeLog) {
        this.activeLog = activeLog;
    }

    /**
     * 
     * @return
     *     The creditsMin
     */
    @JsonProperty("credits_min")
    public String getCreditsMin() {
        return creditsMin;
    }

    /**
     * 
     * @param creditsMin
     *     The credits_min
     */
    @JsonProperty("credits_min")
    public void setCreditsMin(String creditsMin) {
        this.creditsMin = creditsMin;
    }

    /**
     * 
     * @return
     *     The creditsNorm
     */
    @JsonProperty("credits_norm")
    public String getCreditsNorm() {
        return creditsNorm;
    }

    /**
     * 
     * @param creditsNorm
     *     The credits_norm
     */
    @JsonProperty("credits_norm")
    public void setCreditsNorm(String creditsNorm) {
        this.creditsNorm = creditsNorm;
    }

    /**
     * 
     * @return
     *     The creditsObj
     */
    @JsonProperty("credits_obj")
    public String getCreditsObj() {
        return creditsObj;
    }

    /**
     * 
     * @param creditsObj
     *     The credits_obj
     */
    @JsonProperty("credits_obj")
    public void setCreditsObj(String creditsObj) {
        this.creditsObj = creditsObj;
    }

    /**
     * 
     * @return
     *     The nslogMin
     */
    @JsonProperty("nslog_min")
    public String getNslogMin() {
        return nslogMin;
    }

    /**
     * 
     * @param nslogMin
     *     The nslog_min
     */
    @JsonProperty("nslog_min")
    public void setNslogMin(String nslogMin) {
        this.nslogMin = nslogMin;
    }

    /**
     * 
     * @return
     *     The nslogNorm
     */
    @JsonProperty("nslog_norm")
    public String getNslogNorm() {
        return nslogNorm;
    }

    /**
     * 
     * @param nslogNorm
     *     The nslog_norm
     */
    @JsonProperty("nslog_norm")
    public void setNslogNorm(String nslogNorm) {
        this.nslogNorm = nslogNorm;
    }

    /**
     * 
     * @return
     *     The semesterCode
     */
    @JsonProperty("semester_code")
    public String getSemesterCode() {
        return semesterCode;
    }

    /**
     * 
     * @param semesterCode
     *     The semester_code
     */
    @JsonProperty("semester_code")
    public void setSemesterCode(String semesterCode) {
        this.semesterCode = semesterCode;
    }

    /**
     * 
     * @return
     *     The semesterNum
     */
    @JsonProperty("semester_num")
    public String getSemesterNum() {
        return semesterNum;
    }

    /**
     * 
     * @param semesterNum
     *     The semester_num
     */
    @JsonProperty("semester_num")
    public void setSemesterNum(String semesterNum) {
        this.semesterNum = semesterNum;
    }

    /**
     * 
     * @return
     *     The achieved
     */
    @JsonProperty("achieved")
    public Integer getAchieved() {
        return achieved;
    }

    /**
     * 
     * @param achieved
     *     The achieved
     */
    @JsonProperty("achieved")
    public void setAchieved(Integer achieved) {
        this.achieved = achieved;
    }

    /**
     * 
     * @return
     *     The failed
     */
    @JsonProperty("failed")
    public Integer getFailed() {
        return failed;
    }

    /**
     * 
     * @param failed
     *     The failed
     */
    @JsonProperty("failed")
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * 
     * @return
     *     The inprogress
     */
    @JsonProperty("inprogress")
    public Integer getInprogress() {
        return inprogress;
    }

    /**
     * 
     * @param inprogress
     *     The inprogress
     */
    @JsonProperty("inprogress")
    public void setInprogress(Integer inprogress) {
        this.inprogress = inprogress;
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
