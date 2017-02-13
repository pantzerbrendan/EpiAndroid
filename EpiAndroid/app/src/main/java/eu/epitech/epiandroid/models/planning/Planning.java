package eu.epitech.epiandroid.models.planning;

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
        "dates",
        "end",
        "type_title",
        "register_prof",
        "allowed_planning_end",
        "codeevent",
        "nb_hours",
        "allow_token",
        "num_event",
        "scolaryear",
        "allowed_planning_start",
        "prof_inst",
        "start",
        "module_registered",
        "is_rdv",
        "titlemodule",
        "codemodule",
        "codeinstance",
        "in_more_than_one_month",
        "type_code",
        "project",
        "nb_group",
        "past",
        "total_students_registered",
        "rdv_group_registered",
        "event_registered",
        "codeacti",
        "nb_max_students_projet",
        "module_available",
        "register_month",
        "rdv_indiv_registered",
        "semester",
        "acti_title",
        "room",
        "instance_location",
        "title",
        "allow_register",
        "register_student"
})
/**
 * Class representing a planning
 */
public class Planning {

    @JsonProperty("dates")
    private Object dates;
    @JsonProperty("end")
    private String end;
    @JsonProperty("type_title")
    private String typeTitle;
    @JsonProperty("register_prof")
    private Boolean registerProf;
    @JsonProperty("allowed_planning_end")
    private String allowedPlanningEnd;
    @JsonProperty("codeevent")
    private String codeevent;
    @JsonProperty("nb_hours")
    private String nbHours;
    @JsonProperty("allow_token")
    private Boolean allowToken;
    @JsonProperty("num_event")
    private Integer numEvent;
    @JsonProperty("scolaryear")
    private String scolaryear;
    @JsonProperty("allowed_planning_start")
    private String allowedPlanningStart;
    @JsonProperty("prof_inst")
    private List<ProfInst> profInst = new ArrayList<ProfInst>();
    @JsonProperty("start")
    private String start;
    @JsonProperty("module_registered")
    private Boolean moduleRegistered;
    @JsonProperty("is_rdv")
    private String isRdv;
    @JsonProperty("titlemodule")
    private String titlemodule;
    @JsonProperty("codemodule")
    private String codemodule;
    @JsonProperty("codeinstance")
    private String codeinstance;
    @JsonProperty("in_more_than_one_month")
    private Boolean inMoreThanOneMonth;
    @JsonProperty("type_code")
    private String typeCode;
    @JsonProperty("project")
    private Boolean project;
    @JsonProperty("nb_group")
    private Integer nbGroup;
    @JsonProperty("past")
    private Boolean past;
    @JsonProperty("total_students_registered")
    private Integer totalStudentsRegistered;
    @JsonProperty("rdv_group_registered")
    private Object rdvGroupRegistered;
    @JsonProperty("event_registered")
    private Object eventRegistered;
    @JsonProperty("codeacti")
    private String codeacti;
    @JsonProperty("nb_max_students_projet")
    private Object nbMaxStudentsProjet;
    @JsonProperty("module_available")
    private Boolean moduleAvailable;
    @JsonProperty("register_month")
    private Boolean registerMonth;
    @JsonProperty("rdv_indiv_registered")
    private Object rdvIndivRegistered;
    @JsonProperty("semester")
    private Integer semester;
    @JsonProperty("acti_title")
    private String actiTitle;
    @JsonProperty("room")
    private Room room;
    @JsonProperty("instance_location")
    private String instanceLocation;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("allow_register")
    private Boolean allowRegister;
    @JsonProperty("register_student")
    private Boolean registerStudent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The dates
     */
    @JsonProperty("dates")
    public Object getDates() {
        return dates;
    }

    /**
     *
     * @param dates
     * The dates
     */
    @JsonProperty("dates")
    public void setDates(Object dates) {
        this.dates = dates;
    }

    /**
     *
     * @return
     * The end
     */
    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    /**
     *
     * @param end
     * The end
     */
    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     *
     * @return
     * The typeTitle
     */
    @JsonProperty("type_title")
    public String getTypeTitle() {
        return typeTitle;
    }

    /**
     *
     * @param typeTitle
     * The type_title
     */
    @JsonProperty("type_title")
    public void setTypeTitle(String typeTitle) {
        this.typeTitle = typeTitle;
    }

    /**
     *
     * @return
     * The registerProf
     */
    @JsonProperty("register_prof")
    public Boolean getRegisterProf() {
        return registerProf;
    }

    /**
     *
     * @param registerProf
     * The register_prof
     */
    @JsonProperty("register_prof")
    public void setRegisterProf(Boolean registerProf) {
        this.registerProf = registerProf;
    }

    /**
     *
     * @return
     * The allowedPlanningEnd
     */
    @JsonProperty("allowed_planning_end")
    public String getAllowedPlanningEnd() {
        return allowedPlanningEnd;
    }

    /**
     *
     * @param allowedPlanningEnd
     * The allowed_planning_end
     */
    @JsonProperty("allowed_planning_end")
    public void setAllowedPlanningEnd(String allowedPlanningEnd) {
        this.allowedPlanningEnd = allowedPlanningEnd;
    }

    /**
     *
     * @return
     * The codeevent
     */
    @JsonProperty("codeevent")
    public String getCodeevent() {
        return codeevent;
    }

    /**
     *
     * @param codeevent
     * The codeevent
     */
    @JsonProperty("codeevent")
    public void setCodeevent(String codeevent) {
        this.codeevent = codeevent;
    }

    /**
     *
     * @return
     * The nbHours
     */
    @JsonProperty("nb_hours")
    public String getNbHours() {
        return nbHours;
    }

    /**
     *
     * @param nbHours
     * The nb_hours
     */
    @JsonProperty("nb_hours")
    public void setNbHours(String nbHours) {
        this.nbHours = nbHours;
    }

    /**
     *
     * @return
     * The allowToken
     */
    @JsonProperty("allow_token")
    public Boolean getAllowToken() {
        return allowToken;
    }

    /**
     *
     * @param allowToken
     * The allow_token
     */
    @JsonProperty("allow_token")
    public void setAllowToken(Boolean allowToken) {
        this.allowToken = allowToken;
    }

    /**
     *
     * @return
     * The numEvent
     */
    @JsonProperty("num_event")
    public Integer getNumEvent() {
        return numEvent;
    }

    /**
     *
     * @param numEvent
     * The num_event
     */
    @JsonProperty("num_event")
    public void setNumEvent(Integer numEvent) {
        this.numEvent = numEvent;
    }

    /**
     *
     * @return
     * The scolaryear
     */
    @JsonProperty("scolaryear")
    public String getScolaryear() {
        return scolaryear;
    }

    /**
     *
     * @param scolaryear
     * The scolaryear
     */
    @JsonProperty("scolaryear")
    public void setScolaryear(String scolaryear) {
        this.scolaryear = scolaryear;
    }

    /**
     *
     * @return
     * The allowedPlanningStart
     */
    @JsonProperty("allowed_planning_start")
    public String getAllowedPlanningStart() {
        return allowedPlanningStart;
    }

    /**
     *
     * @param allowedPlanningStart
     * The allowed_planning_start
     */
    @JsonProperty("allowed_planning_start")
    public void setAllowedPlanningStart(String allowedPlanningStart) {
        this.allowedPlanningStart = allowedPlanningStart;
    }

    /**
     *
     * @return
     * The profInst
     */
    @JsonProperty("prof_inst")
    public List<ProfInst> getProfInst() {
        return profInst;
    }

    /**
     *
     * @param profInst
     * The prof_inst
     */
    @JsonProperty("prof_inst")
    public void setProfInst(List<ProfInst> profInst) {
        this.profInst = profInst;
    }

    /**
     *
     * @return
     * The start
     */
    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    /**
     *
     * @param start
     * The start
     */
    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    /**
     *
     * @return
     * The moduleRegistered
     */
    @JsonProperty("module_registered")
    public Boolean getModuleRegistered() {
        return moduleRegistered;
    }

    /**
     *
     * @param moduleRegistered
     * The module_registered
     */
    @JsonProperty("module_registered")
    public void setModuleRegistered(Boolean moduleRegistered) {
        this.moduleRegistered = moduleRegistered;
    }

    /**
     *
     * @return
     * The isRdv
     */
    @JsonProperty("is_rdv")
    public String getIsRdv() {
        return isRdv;
    }

    /**
     *
     * @param isRdv
     * The is_rdv
     */
    @JsonProperty("is_rdv")
    public void setIsRdv(String isRdv) {
        this.isRdv = isRdv;
    }

    /**
     *
     * @return
     * The titlemodule
     */
    @JsonProperty("titlemodule")
    public String getTitlemodule() {
        return titlemodule;
    }

    /**
     *
     * @param titlemodule
     * The titlemodule
     */
    @JsonProperty("titlemodule")
    public void setTitlemodule(String titlemodule) {
        this.titlemodule = titlemodule;
    }

    /**
     *
     * @return
     * The codemodule
     */
    @JsonProperty("codemodule")
    public String getCodemodule() {
        return codemodule;
    }

    /**
     *
     * @param codemodule
     * The codemodule
     */
    @JsonProperty("codemodule")
    public void setCodemodule(String codemodule) {
        this.codemodule = codemodule;
    }

    /**
     *
     * @return
     * The codeinstance
     */
    @JsonProperty("codeinstance")
    public String getCodeinstance() {
        return codeinstance;
    }

    /**
     *
     * @param codeinstance
     * The codeinstance
     */
    @JsonProperty("codeinstance")
    public void setCodeinstance(String codeinstance) {
        this.codeinstance = codeinstance;
    }

    /**
     *
     * @return
     * The inMoreThanOneMonth
     */
    @JsonProperty("in_more_than_one_month")
    public Boolean getInMoreThanOneMonth() {
        return inMoreThanOneMonth;
    }

    /**
     *
     * @param inMoreThanOneMonth
     * The in_more_than_one_month
     */
    @JsonProperty("in_more_than_one_month")
    public void setInMoreThanOneMonth(Boolean inMoreThanOneMonth) {
        this.inMoreThanOneMonth = inMoreThanOneMonth;
    }

    /**
     *
     * @return
     * The typeCode
     */
    @JsonProperty("type_code")
    public String getTypeCode() {
        return typeCode;
    }

    /**
     *
     * @param typeCode
     * The type_code
     */
    @JsonProperty("type_code")
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    /**
     *
     * @return
     * The project
     */
    @JsonProperty("project")
    public Boolean getProject() {
        return project;
    }

    /**
     *
     * @param project
     * The project
     */
    @JsonProperty("project")
    public void setProject(Boolean project) {
        this.project = project;
    }

    /**
     *
     * @return
     * The nbGroup
     */
    @JsonProperty("nb_group")
    public Integer getNbGroup() {
        return nbGroup;
    }

    /**
     *
     * @param nbGroup
     * The nb_group
     */
    @JsonProperty("nb_group")
    public void setNbGroup(Integer nbGroup) {
        this.nbGroup = nbGroup;
    }

    /**
     *
     * @return
     * The past
     */
    @JsonProperty("past")
    public Boolean getPast() {
        return past;
    }

    /**
     *
     * @param past
     * The past
     */
    @JsonProperty("past")
    public void setPast(Boolean past) {
        this.past = past;
    }

    /**
     *
     * @return
     * The totalStudentsRegistered
     */
    @JsonProperty("total_students_registered")
    public Integer getTotalStudentsRegistered() {
        return totalStudentsRegistered;
    }

    /**
     *
     * @param totalStudentsRegistered
     * The total_students_registered
     */
    @JsonProperty("total_students_registered")
    public void setTotalStudentsRegistered(Integer totalStudentsRegistered) {
        this.totalStudentsRegistered = totalStudentsRegistered;
    }

    /**
     *
     * @return
     * The rdvGroupRegistered
     */
    @JsonProperty("rdv_group_registered")
    public Object getRdvGroupRegistered() {
        return rdvGroupRegistered;
    }

    /**
     *
     * @param rdvGroupRegistered
     * The rdv_group_registered
     */
    @JsonProperty("rdv_group_registered")
    public void setRdvGroupRegistered(Object rdvGroupRegistered) {
        this.rdvGroupRegistered = rdvGroupRegistered;
    }

    /**
     *
     * @return
     * The eventRegistered
     */
    @JsonProperty("event_registered")
    public Object getEventRegistered() {
        return eventRegistered;
    }

    /**
     *
     * @param eventRegistered
     * The event_registered
     */
    @JsonProperty("event_registered")
    public void setEventRegistered(Object eventRegistered) {
        this.eventRegistered = eventRegistered;
    }

    /**
     *
     * @return
     * The codeacti
     */
    @JsonProperty("codeacti")
    public String getCodeacti() {
        return codeacti;
    }

    /**
     *
     * @param codeacti
     * The codeacti
     */
    @JsonProperty("codeacti")
    public void setCodeacti(String codeacti) {
        this.codeacti = codeacti;
    }

    /**
     *
     * @return
     * The nbMaxStudentsProjet
     */
    @JsonProperty("nb_max_students_projet")
    public Object getNbMaxStudentsProjet() {
        return nbMaxStudentsProjet;
    }

    /**
     *
     * @param nbMaxStudentsProjet
     * The nb_max_students_projet
     */
    @JsonProperty("nb_max_students_projet")
    public void setNbMaxStudentsProjet(Object nbMaxStudentsProjet) {
        this.nbMaxStudentsProjet = nbMaxStudentsProjet;
    }

    /**
     *
     * @return
     * The moduleAvailable
     */
    @JsonProperty("module_available")
    public Boolean getModuleAvailable() {
        return moduleAvailable;
    }

    /**
     *
     * @param moduleAvailable
     * The module_available
     */
    @JsonProperty("module_available")
    public void setModuleAvailable(Boolean moduleAvailable) {
        this.moduleAvailable = moduleAvailable;
    }

    /**
     *
     * @return
     * The registerMonth
     */
    @JsonProperty("register_month")
    public Boolean getRegisterMonth() {
        return registerMonth;
    }

    /**
     *
     * @param registerMonth
     * The register_month
     */
    @JsonProperty("register_month")
    public void setRegisterMonth(Boolean registerMonth) {
        this.registerMonth = registerMonth;
    }

    /**
     *
     * @return
     * The rdvIndivRegistered
     */
    @JsonProperty("rdv_indiv_registered")
    public Object getRdvIndivRegistered() {
        return rdvIndivRegistered;
    }

    /**
     *
     * @param rdvIndivRegistered
     * The rdv_indiv_registered
     */
    @JsonProperty("rdv_indiv_registered")
    public void setRdvIndivRegistered(Object rdvIndivRegistered) {
        this.rdvIndivRegistered = rdvIndivRegistered;
    }

    /**
     *
     * @return
     * The semester
     */
    @JsonProperty("semester")
    public Integer getSemester() {
        return semester;
    }

    /**
     *
     * @param semester
     * The semester
     */
    @JsonProperty("semester")
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    /**
     *
     * @return
     * The actiTitle
     */
    @JsonProperty("acti_title")
    public String getActiTitle() {
        return actiTitle;
    }

    /**
     *
     * @param actiTitle
     * The acti_title
     */
    @JsonProperty("acti_title")
    public void setActiTitle(String actiTitle) {
        this.actiTitle = actiTitle;
    }

    /**
     *
     * @return
     * The room
     */
    @JsonProperty("room")
    public Room getRoom() {
        return room;
    }

    /**
     *
     * @param room
     * The room
     */
    @JsonProperty("room")
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     *
     * @return
     * The instanceLocation
     */
    @JsonProperty("instance_location")
    public String getInstanceLocation() {
        return instanceLocation;
    }

    /**
     *
     * @param instanceLocation
     * The instance_location
     */
    @JsonProperty("instance_location")
    public void setInstanceLocation(String instanceLocation) {
        this.instanceLocation = instanceLocation;
    }

    /**
     *
     * @return
     * The title
     */
    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The allowRegister
     */
    @JsonProperty("allow_register")
    public Boolean getAllowRegister() {
        return allowRegister;
    }

    /**
     *
     * @param allowRegister
     * The allow_register
     */
    @JsonProperty("allow_register")
    public void setAllowRegister(Boolean allowRegister) {
        this.allowRegister = allowRegister;
    }

    /**
     *
     * @return
     * The registerStudent
     */
    @JsonProperty("register_student")
    public Boolean getRegisterStudent() {
        return registerStudent;
    }

    /**
     *
     * @param registerStudent
     * The register_student
     */
    @JsonProperty("register_student")
    public void setRegisterStudent(Boolean registerStudent) {
        this.registerStudent = registerStudent;
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