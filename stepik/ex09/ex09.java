public class ex09 {
	public static void main(String[] args) {
		String [] roles = {
				"Gorodnichij","Ammos Fedorovich",
				"Artemij Filippovich",
				"Luka Lukich"};
		String [] textLines ={
				"Gorodnichij: Ja priglasil vas, gospoda, s tem, chtoby soobshhit' vam preneprijatnoe izvestie: k nam edet revizor.",
				"Ammos Fedorovich: Kak revizor?",
				"Artemij Filippovich: Kak revizor?",
				"Gorodnichij: Revizor iz Peterburga, inkognito. I eshhe s sekretnym predpisan'em.",
				"Ammos Fedorovich: Vot te na!",
				"Artemij Filippovich: Vot ne bylo zaboty, tak podaj!",
				"Luka Lukich: Gospodi bozhe! eshhe i s sekretnym predpisan'em!"};
		String res = printTextPerRole(roles,textLines);
		System.out.println(res);
	}

	private static String printTextPerRole(String[] roles, String[] textLines) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < roles.length; i++) {
			String name = roles[i];
			result.append(name).append(":").append("\n");
			for (int j = 0; j < textLines.length; j++) {
				if (textLines[j].startsWith(name + ":")) {
					result.append(j + 1).append(") ").append(textLines[j].replaceFirst(name + ": ", "")).append("\n");
				}
			}
			result.append("\n");
		}
		return result.toString();
	}
}
