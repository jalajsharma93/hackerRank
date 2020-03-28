public static String findDay(int month, int day, int year) {
        Calendar cal =Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,(month-1));
        cal.set(Calendar.DAY_OF_MONTH,day);
        Date df = cal.getTime();
        DateFormat dff = new SimpleDateFormat("EEEEEEEE");
        String dy = dff.format(df);
        //System.out.println(dy);
        return dy.toUpperCase();
    }
