using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace Password_Manager
{
    /// <summary>
    /// Interaction logic for homw.xaml
    /// </summary>
    public partial class homw : Window
    {
        public homw()
        {
            InitializeComponent();
            parent.Children.Clear();
            parent.Children.Add(password);
            phonesave.Visibility = Visibility.Hidden;
            emailsave.Visibility = Visibility.Hidden;

        }

        private void Window_Closed(object sender, EventArgs e) => Application.Current.Shutdown();

        private void Passwords_Click(object sender, RoutedEventArgs e)
        {

            parent.Children.Clear();
            parent.Children.Add(password);
        }

        private void Settings_Click(object sender, RoutedEventArgs e)
        {
            parent.Children.Clear();
            parent.Children.Add(setting);
        }

        private void Phoneedit_Click(object sender, RoutedEventArgs e)
        {

            phonesave.Visibility = Visibility.Visible;
            phone.IsReadOnly = false;
            phoneedit.Visibility = Visibility.Hidden;
        }

        private void Phonesave_Click(object sender, RoutedEventArgs e)
        {
            phonesave.Visibility = Visibility.Hidden;
            phone.IsReadOnly = true;
            phoneedit.Visibility = Visibility.Visible;
        }

        private void Emailsave_Click(object sender, RoutedEventArgs e)
        {
            emailsave.Visibility = Visibility.Hidden;
            email.IsReadOnly = true;
            emailedit.Visibility = Visibility.Visible;
        }

        private void Emailedit_Click(object sender, RoutedEventArgs e)
        {
            emailsave.Visibility = Visibility.Visible;
            email.IsReadOnly = false;
            emailedit.Visibility = Visibility.Hidden;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {

            add a = new add();
            a.ShowDialog();
            parent.Children.Clear();
            parent.Children.Add(password);
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            
            if (search.Text.Equals("gmail"))
            {
                gmail.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                games.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }
            else if (search.Text.Equals("facebook"))
            {
                facebook.Visibility = Visibility.Visible;
                gmail.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                games.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }
            else if (search.Text.Equals("twitter"))
            {
                twitter.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                gmail.Visibility = Visibility.Hidden;
                games.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }


            //ALL games e.g:steam,uplay,rockstar etc
            else if (search.Text.Equals("games"))
            {
                games.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                gmail.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }
            else if (search.Text.Equals("steam"))
            {
                games.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                gmail.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }
            else if (search.Text.Equals("uplay"))
            {
                games.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                gmail.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }
            else if (search.Text.Equals("rockstar"))
            {
                games.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                gmail.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }
            else if (search.Text.Equals("epicgames"))
            {
                games.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                gmail.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }
            else if (search.Text.Equals("gog"))
            {
                games.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                gmail.Visibility = Visibility.Hidden;
                other.Visibility = Visibility.Hidden;
            }


            //others e.g: linkdn,microsoft,studentportal etc
            else if (search.Text.Equals("other"))
            {
                other.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Hidden;
                twitter.Visibility = Visibility.Hidden;
                gmail.Visibility = Visibility.Hidden;
                games.Visibility = Visibility.Hidden;
            }
            else
            {
                other.Visibility = Visibility.Visible;
                facebook.Visibility = Visibility.Visible;
                twitter.Visibility = Visibility.Visible;
                gmail.Visibility = Visibility.Visible;
                games.Visibility = Visibility.Visible;
            }
        }

        private void Gmail_Click(object sender, RoutedEventArgs e)
        {
          add ad = new add();
            ad.ShowDialog();

        }
    }
}
