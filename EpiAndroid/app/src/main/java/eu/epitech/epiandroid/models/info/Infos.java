
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
    "id",
    "login",
    "title",
    "email",
    "internal_email",
    "lastname",
    "firstname",
    "userinfo",
    "referent_used",
    "picture",
    "picture_fun",
    "email_referent",
    "pass_referent",
    "promo",
    "semester",
    "uid",
    "gid",
    "location",
    "documents",
    "userdocs",
    "shell",
    "netsoul",
    "close",
    "close_reason",
    "ctime",
    "mtime",
    "comment",
    "id_promo",
    "id_history",
    "course_code",
    "school_code",
    "school_title",
    "old_id_promo",
    "old_id_location",
    "rights",
    "invited",
    "studentyear",
    "admin",
    "decoded"
})

/**
 * Contains lot of useful informations about the student.
 */

public class Infos {

    @JsonProperty("id")
    private String id;
    @JsonProperty("login")
    private String login;
    @JsonProperty("title")
    private String title;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("internal_email")
    private String internalEmail;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("userinfo")
    private String userinfo;
    @JsonProperty("referent_used")
    private Boolean referentUsed;
    @JsonProperty("picture")
    private String picture;
    @JsonProperty("picture_fun")
    private Object pictureFun;
    @JsonProperty("email_referent")
    private String emailReferent;
    @JsonProperty("pass_referent")
    private String passReferent;
    @JsonProperty("promo")
    private Integer promo;
    @JsonProperty("semester")
    private Integer semester;
    @JsonProperty("uid")
    private Integer uid;
    @JsonProperty("gid")
    private Integer gid;
    @JsonProperty("location")
    private String location;
    @JsonProperty("documents")
    private String documents;
    @JsonProperty("userdocs")
    private String userdocs;
    @JsonProperty("shell")
    private Object shell;
    @JsonProperty("netsoul")
    private Object netsoul;
    @JsonProperty("close")
    private Boolean close;
    @JsonProperty("close_reason")
    private Object closeReason;
    @JsonProperty("ctime")
    private String ctime;
    @JsonProperty("mtime")
    private String mtime;
    @JsonProperty("comment")
    private Object comment;
    @JsonProperty("id_promo")
    private String idPromo;
    @JsonProperty("id_history")
    private String idHistory;
    @JsonProperty("course_code")
    private String courseCode;
    @JsonProperty("school_code")
    private String schoolCode;
    @JsonProperty("school_title")
    private String schoolTitle;
    @JsonProperty("old_id_promo")
    private String oldIdPromo;
    @JsonProperty("old_id_location")
    private String oldIdLocation;
    @JsonProperty("rights")
    private Rights rights;
    @JsonProperty("invited")
    private Boolean invited;
    @JsonProperty("studentyear")
    private Integer studentyear;
    @JsonProperty("admin")
    private Boolean admin;
    @JsonProperty("decoded")
    private Integer decoded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The login
     */
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @param login
     *     The login
     */
    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

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
     *     The email
     */
    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The internalEmail
     */
    @JsonProperty("internal_email")
    public String getInternalEmail() {
        return internalEmail;
    }

    /**
     * 
     * @param internalEmail
     *     The internal_email
     */
    @JsonProperty("internal_email")
    public void setInternalEmail(String internalEmail) {
        this.internalEmail = internalEmail;
    }

    /**
     * 
     * @return
     *     The lastname
     */
    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    /**
     * 
     * @param lastname
     *     The lastname
     */
    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 
     * @return
     *     The firstname
     */
    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    /**
     * 
     * @param firstname
     *     The firstname
     */
    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 
     * @return
     *     The userinfo
     */
    @JsonProperty("userinfo")
    public String getUserinfo() {
        return userinfo;
    }

    /**
     * 
     * @param userinfo
     *     The userinfo
     */
    @JsonProperty("userinfo")
    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo;
    }

    /**
     * 
     * @return
     *     The referentUsed
     */
    @JsonProperty("referent_used")
    public Boolean getReferentUsed() {
        return referentUsed;
    }

    /**
     * 
     * @param referentUsed
     *     The referent_used
     */
    @JsonProperty("referent_used")
    public void setReferentUsed(Boolean referentUsed) {
        this.referentUsed = referentUsed;
    }

    /**
     * 
     * @return
     *     The picture
     */
    @JsonProperty("picture")
    public String getPicture() {
        return picture;
    }

    /**
     * 
     * @param picture
     *     The picture
     */
    @JsonProperty("picture")
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 
     * @return
     *     The pictureFun
     */
    @JsonProperty("picture_fun")
    public Object getPictureFun() {
        return pictureFun;
    }

    /**
     * 
     * @param pictureFun
     *     The picture_fun
     */
    @JsonProperty("picture_fun")
    public void setPictureFun(Object pictureFun) {
        this.pictureFun = pictureFun;
    }

    /**
     * 
     * @return
     *     The emailReferent
     */
    @JsonProperty("email_referent")
    public String getEmailReferent() {
        return emailReferent;
    }

    /**
     * 
     * @param emailReferent
     *     The email_referent
     */
    @JsonProperty("email_referent")
    public void setEmailReferent(String emailReferent) {
        this.emailReferent = emailReferent;
    }

    /**
     * 
     * @return
     *     The passReferent
     */
    @JsonProperty("pass_referent")
    public String getPassReferent() {
        return passReferent;
    }

    /**
     * 
     * @param passReferent
     *     The pass_referent
     */
    @JsonProperty("pass_referent")
    public void setPassReferent(String passReferent) {
        this.passReferent = passReferent;
    }

    /**
     * 
     * @return
     *     The promo
     */
    @JsonProperty("promo")
    public Integer getPromo() {
        return promo;
    }

    /**
     * 
     * @param promo
     *     The promo
     */
    @JsonProperty("promo")
    public void setPromo(Integer promo) {
        this.promo = promo;
    }

    /**
     * 
     * @return
     *     The semester
     */
    @JsonProperty("semester")
    public Integer getSemester() {
        return semester;
    }

    /**
     * 
     * @param semester
     *     The semester
     */
    @JsonProperty("semester")
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    /**
     * 
     * @return
     *     The uid
     */
    @JsonProperty("uid")
    public Integer getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    @JsonProperty("uid")
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     The gid
     */
    @JsonProperty("gid")
    public Integer getGid() {
        return gid;
    }

    /**
     * 
     * @param gid
     *     The gid
     */
    @JsonProperty("gid")
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The documents
     */
    @JsonProperty("documents")
    public String getDocuments() {
        return documents;
    }

    /**
     * 
     * @param documents
     *     The documents
     */
    @JsonProperty("documents")
    public void setDocuments(String documents) {
        this.documents = documents;
    }

    /**
     * 
     * @return
     *     The userdocs
     */
    @JsonProperty("userdocs")
    public String getUserdocs() {
        return userdocs;
    }

    /**
     * 
     * @param userdocs
     *     The userdocs
     */
    @JsonProperty("userdocs")
    public void setUserdocs(String userdocs) {
        this.userdocs = userdocs;
    }

    /**
     * 
     * @return
     *     The shell
     */
    @JsonProperty("shell")
    public Object getShell() {
        return shell;
    }

    /**
     * 
     * @param shell
     *     The shell
     */
    @JsonProperty("shell")
    public void setShell(Object shell) {
        this.shell = shell;
    }

    /**
     * 
     * @return
     *     The netsoul
     */
    @JsonProperty("netsoul")
    public Object getNetsoul() {
        return netsoul;
    }

    /**
     * 
     * @param netsoul
     *     The netsoul
     */
    @JsonProperty("netsoul")
    public void setNetsoul(Object netsoul) {
        this.netsoul = netsoul;
    }

    /**
     * 
     * @return
     *     The close
     */
    @JsonProperty("close")
    public Boolean getClose() {
        return close;
    }

    /**
     * 
     * @param close
     *     The close
     */
    @JsonProperty("close")
    public void setClose(Boolean close) {
        this.close = close;
    }

    /**
     * 
     * @return
     *     The closeReason
     */
    @JsonProperty("close_reason")
    public Object getCloseReason() {
        return closeReason;
    }

    /**
     * 
     * @param closeReason
     *     The close_reason
     */
    @JsonProperty("close_reason")
    public void setCloseReason(Object closeReason) {
        this.closeReason = closeReason;
    }

    /**
     * 
     * @return
     *     The ctime
     */
    @JsonProperty("ctime")
    public String getCtime() {
        return ctime;
    }

    /**
     * 
     * @param ctime
     *     The ctime
     */
    @JsonProperty("ctime")
    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    /**
     * 
     * @return
     *     The mtime
     */
    @JsonProperty("mtime")
    public String getMtime() {
        return mtime;
    }

    /**
     * 
     * @param mtime
     *     The mtime
     */
    @JsonProperty("mtime")
    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    /**
     * 
     * @return
     *     The comment
     */
    @JsonProperty("comment")
    public Object getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *     The comment
     */
    @JsonProperty("comment")
    public void setComment(Object comment) {
        this.comment = comment;
    }

    /**
     * 
     * @return
     *     The idPromo
     */
    @JsonProperty("id_promo")
    public String getIdPromo() {
        return idPromo;
    }

    /**
     * 
     * @param idPromo
     *     The id_promo
     */
    @JsonProperty("id_promo")
    public void setIdPromo(String idPromo) {
        this.idPromo = idPromo;
    }

    /**
     * 
     * @return
     *     The idHistory
     */
    @JsonProperty("id_history")
    public String getIdHistory() {
        return idHistory;
    }

    /**
     * 
     * @param idHistory
     *     The id_history
     */
    @JsonProperty("id_history")
    public void setIdHistory(String idHistory) {
        this.idHistory = idHistory;
    }

    /**
     * 
     * @return
     *     The courseCode
     */
    @JsonProperty("course_code")
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * 
     * @param courseCode
     *     The course_code
     */
    @JsonProperty("course_code")
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * 
     * @return
     *     The schoolCode
     */
    @JsonProperty("school_code")
    public String getSchoolCode() {
        return schoolCode;
    }

    /**
     * 
     * @param schoolCode
     *     The school_code
     */
    @JsonProperty("school_code")
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    /**
     * 
     * @return
     *     The schoolTitle
     */
    @JsonProperty("school_title")
    public String getSchoolTitle() {
        return schoolTitle;
    }

    /**
     * 
     * @param schoolTitle
     *     The school_title
     */
    @JsonProperty("school_title")
    public void setSchoolTitle(String schoolTitle) {
        this.schoolTitle = schoolTitle;
    }

    /**
     * 
     * @return
     *     The oldIdPromo
     */
    @JsonProperty("old_id_promo")
    public String getOldIdPromo() {
        return oldIdPromo;
    }

    /**
     * 
     * @param oldIdPromo
     *     The old_id_promo
     */
    @JsonProperty("old_id_promo")
    public void setOldIdPromo(String oldIdPromo) {
        this.oldIdPromo = oldIdPromo;
    }

    /**
     * 
     * @return
     *     The oldIdLocation
     */
    @JsonProperty("old_id_location")
    public String getOldIdLocation() {
        return oldIdLocation;
    }

    /**
     * 
     * @param oldIdLocation
     *     The old_id_location
     */
    @JsonProperty("old_id_location")
    public void setOldIdLocation(String oldIdLocation) {
        this.oldIdLocation = oldIdLocation;
    }

    /**
     * 
     * @return
     *     The rights
     */
    @JsonProperty("rights")
    public Rights getRights() {
        return rights;
    }

    /**
     * 
     * @param rights
     *     The rights
     */
    @JsonProperty("rights")
    public void setRights(Rights rights) {
        this.rights = rights;
    }

    /**
     * 
     * @return
     *     The invited
     */
    @JsonProperty("invited")
    public Boolean getInvited() {
        return invited;
    }

    /**
     * 
     * @param invited
     *     The invited
     */
    @JsonProperty("invited")
    public void setInvited(Boolean invited) {
        this.invited = invited;
    }

    /**
     * 
     * @return
     *     The studentyear
     */
    @JsonProperty("studentyear")
    public Integer getStudentyear() {
        return studentyear;
    }

    /**
     * 
     * @param studentyear
     *     The studentyear
     */
    @JsonProperty("studentyear")
    public void setStudentyear(Integer studentyear) {
        this.studentyear = studentyear;
    }

    /**
     * 
     * @return
     *     The admin
     */
    @JsonProperty("admin")
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * 
     * @param admin
     *     The admin
     */
    @JsonProperty("admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * 
     * @return
     *     The decoded
     */
    @JsonProperty("decoded")
    public Integer getDecoded() {
        return decoded;
    }

    /**
     * 
     * @param decoded
     *     The decoded
     */
    @JsonProperty("decoded")
    public void setDecoded(Integer decoded) {
        this.decoded = decoded;
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
