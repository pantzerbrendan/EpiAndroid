
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
    "ip",
    "board",
    "history",
    "infos",
    "current"
})

/**
 * Is the class used to contains others classes for the main informations request.
 */

public class InfosJackson {

    @JsonProperty("ip")
    private String ip;
    @JsonProperty("board")
    private Board board;
    @JsonProperty("history")
    private List<History> history = new ArrayList<History>();
    @JsonProperty("infos")
    private Infos infos;
    @JsonProperty("current")
    private Current current;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ip
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * 
     * @param ip
     *     The ip
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 
     * @return
     *     The board
     */
    @JsonProperty("board")
    public Board getBoard() {
        return board;
    }

    /**
     * 
     * @param board
     *     The board
     */
    @JsonProperty("board")
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * 
     * @return
     *     The history
     */
    @JsonProperty("history")
    public List<History> getHistory() {
        return history;
    }

    /**
     * 
     * @param history
     *     The history
     */
    @JsonProperty("history")
    public void setHistory(List<History> history) {
        this.history = history;
    }

    /**
     * 
     * @return
     *     The infos
     */
    @JsonProperty("infos")
    public Infos getInfos() {
        return infos;
    }

    /**
     * 
     * @param infos
     *     The infos
     */
    @JsonProperty("infos")
    public void setInfos(Infos infos) {
        this.infos = infos;
    }

    /**
     * 
     * @return
     *     The current
     */
    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    /**
     * 
     * @param current
     *     The current
     */
    @JsonProperty("current")
    public void setCurrent(Current current) {
        this.current = current;
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
