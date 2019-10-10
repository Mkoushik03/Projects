using System;
using System.Collections.Generic;

using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Password_Manager
{

    class databs
    {
        SqlConnection cnn;
        readonly string ConnectionString = @"Data Source = (LocalDB)\v11.0;AttachDbFilename='E:\Games\Password_Manager\bin\Debug\Password_manager.mdf';Integrated Security = True; Connect Timeout = 30";
        public void OpenConection()
        {
            cnn = new SqlConnection(ConnectionString);
            cnn.Open();
        }
        public void CloseConnection()
        {
            cnn.Close();
        }
        public void ExecuteQueries(string Query_)
        {
            SqlCommand cmd = new SqlCommand(Query_, cnn);
            cmd.ExecuteNonQuery();
            
        }


        public SqlDataReader DataReader(string Query_)
        {
            SqlCommand cmd = new SqlCommand(Query_, cnn);
            SqlDataReader dr = cmd.ExecuteReader();
            return dr;
        }


        public object ShowDataInGridView(string Query_)
        {
            SqlDataAdapter dr = new SqlDataAdapter(Query_, ConnectionString);
            DataSet ds = new DataSet();
            dr.Fill(ds);
            object dataum = ds.Tables[0];
            return dataum;
        }
       
    }
}
