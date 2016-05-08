package examples.time.nsParser;

public class nsParser {
	public long ds, hr, min, s, ms, mks, ns;

	public void nsParse(long t) {
		ns = t % 1000;
		mks = (t % 1000000 - ns) / 1000;
		ms = (t % 1000000000 - (mks * 1000 + ns)) / 1000000;
		long allSec = t / 1000000000;
		s = allSec % 60;
		long allMin = allSec / 60;
		min = allMin % 60;
		long allHr = allMin / 60;
		hr = allHr % 24;
		ds = (int) (allHr / 24);
	}

	@Override
	public String toString() {
		return "nsParser [ds=" + ds + ", hr=" + hr + ", min=" + min + ", s=" + s + ", ms=" + ms + ", mks=" + mks
				+ ", ns=" + ns + "]";
	}

}
