public class ex09 {
	public static void main(String[] args) {
		String [] roles= {
				"����������","����� ���������",
				"������� ����������",
				"���� �����"};
		String [] textLines={
				"����������: � ��������� ���, �������, � ���, ����� �������� ��� ������������� ��������: � ��� ���� �������.",
				"����� ���������: ��� �������?",
				"������� ����������: ��� �������?",
				"����������: ������� �� ����������, ���������. � ��� � ��������� ������������.",
				"����� ���������: ��� �� ��!",
				"������� ����������: ��� �� ���� ������, ��� �����!",
				"���� �����: ������� ����! ��� � � ��������� ������������!"};
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
