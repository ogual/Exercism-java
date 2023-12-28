class Badge {
    public String print(Integer id, String name, String department) {
        String label = "";

        if (id != null) {
            // string interpolation
            label = ("[" + id + "] - ");
        }

        label += name;

        if (department != null) {
            // concatenate uppercase department
            label += " - " + department.toUpperCase();
        } else
            // print owner
            label += " - OWNER";
        
        return label;
    }
}
