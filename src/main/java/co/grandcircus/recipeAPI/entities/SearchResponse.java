package co.grandcircus.recipeAPI.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "q", "from", "to", "params", "more", "count", "hits" })
public class SearchResponse {

	@JsonProperty("q")
	private String q;

	@JsonProperty("from")
	private Integer from;

	@JsonProperty("to")
	private Integer to;

	@JsonProperty("params")
	private Params params;

	@JsonProperty("more")
	private Boolean more;

	@JsonProperty("count")
	private Integer count;

	@JsonProperty("hits")
	private List<Hit> hits;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("q")
	public String getQ() {

		return q;
	}

	@JsonProperty("q")
	public void setQ(String q) {

		this.q = q;
	}

	@JsonProperty("from")
	public Integer getFrom() {

		return from;
	}

	@JsonProperty("from")
	public void setFrom(Integer from) {

		this.from = from;
	}

	@JsonProperty("to")
	public Integer getTo() {

		return to;
	}

	@JsonProperty("to")
	public void setTo(Integer to) {

		this.to = to;
	}

	@JsonProperty("params")
	public Params getParams() {

		return params;
	}

	@JsonProperty("params")
	public void setParams(Params params) {

		this.params = params;
	}

	@JsonProperty("more")
	public Boolean getMore() {

		return more;
	}

	@JsonProperty("more")
	public void setMore(Boolean more) {

		this.more = more;
	}

	@JsonProperty("count")
	public Integer getCount() {

		return count;
	}

	@JsonProperty("count")
	public void setCount(Integer count) {

		this.count = count;
	}

	@JsonProperty("hits")
	public List<Hit> getHits() {

		return hits;
	}

	@JsonProperty("hits")
	public void setHits(List<Hit> hits) {

		this.hits = hits;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {

		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {

		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {

		return "SearchResponse [q=" + q + ", from=" + from + ", to=" + to + ", params=" + params + ", more=" + more
				+ ", count=" + count + ", hits=" + hits + ", additionalProperties=" + additionalProperties + "]";
	}
}
