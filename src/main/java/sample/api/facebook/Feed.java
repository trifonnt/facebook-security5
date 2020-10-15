package sample.api.facebook;

import java.util.List;

public class Feed {

	private List<Post> data;

	public Feed() {
	}
	public Feed(List<Post> data) {
		this.data = data;
	}

	public List<Post> getData() {
		return data;
	}

	public void setData(List<Post> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Feed [data=" + data + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feed other = (Feed) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
}
