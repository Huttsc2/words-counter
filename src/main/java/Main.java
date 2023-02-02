class Main{
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("Pen", "Red", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Parker");
        p.setCountColor(2);
        p.setAuto(false);
        p.display();
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Ruler");
        r.setLength(25);
        r.setWood(true);
        r.display();
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider();
        d.setName("Divider");
        d.setDividerType("with pen");
        d.setMetal(true);
        d.display();
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.drawCircle();
    }
}
