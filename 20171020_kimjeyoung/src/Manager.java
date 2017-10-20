
public class Manager extends Employee {
		private String position;

		public Manager(String empNo, String name, String part, String position) {
			// setEmpNo(empNo);
			// setName(name);
			// setPart(part);
			super(empNo, name, part);
			this.position = position;
		}

		public String addStr() {
			String result = "";
			result += "Á÷Ã¥ : " + position + "\n";
			return result;
		}
}
